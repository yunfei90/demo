package com.zhangfei.calc;

import java.net.URL;

import org.eclipse.e4.xwt.IConstants;
import org.eclipse.e4.xwt.XWT;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import com.zhangfei.calc.operator.IOperator;
import com.zhangfei.calc.operator.Operators;
import com.zhangfei.calc.util.NumberUtils;

public class CalcApplication {

	public static final int MAX_CHAR = 18;

	//是否处理输入模式
	private boolean inputMode = false;

	//当前操作符
	private IOperator operator = null;

	public static void main(String args[]) throws Exception {

		URL url = CalcApplication.class.getClassLoader()
				.getResource("ui/" + CalcApplication.class.getSimpleName() + IConstants.XWT_EXTENSION_SUFFIX);
		
		Control control = (Control) XWT.load(url);

		Shell shell = control.getShell();
		shell.layout();
		centerInDisplay(shell);

		// run events loop
		shell.open();
		while (!shell.isDisposed()) {
			if (!shell.getDisplay().readAndDispatch())
				shell.getDisplay().sleep();
		}
	}

	private static void centerInDisplay(Shell shell) {
		Rectangle displayArea = shell.getDisplay().getClientArea();

		int width = 500;
		int height = 500;

		shell.setBounds(displayArea.width / 2 - width / 2, displayArea.height / 2 - height / 2, width, height);
	}

	//查找输出文本框
	public Text findOutputText(Shell shell) {

		return (Text) XWT.findElementByName(shell, "resultText");

	}

	/**
	 * 一元运算符事件处理
	 * 
	 * @param event
	 */
	public void onClickUnayOperator(Event event) {

		Shell shell = event.display.getActiveShell();

		Text output = findOutputText(shell);
		Button button = (Button) event.widget;

		String cmd = button.getText();

		switch (cmd) {

		case "+/-": // 更改符号
			doCmdChangeSymbol(output);
			break;

		case "1/x": // 倒数
			doCmdReciprocal(output);

		}

		output.setSelection(output.getText().length());

	}

	// 倒数运算
	private void doCmdReciprocal(Text output) {

		double leftExp = Double.valueOf(output.getText());

		if (leftExp == 0) {// 除数为0
			return;
		}

		Double result = 1.0d / leftExp;

		output.setText(NumberUtils.double2String(result));

		inputMode = false;

	}

	//控制按键
	public void onSelectionControlButton(Event event) {

		Shell shell = event.display.getActiveShell();
		Text output = findOutputText(shell);

		Button button = (Button) event.widget;

		String cmd = button.getText();

		switch (cmd) {

		case "BS":

			doCmdBS(output);
			break;
		case "AC":

			doCmdAC(output);
			break;
		case "+/-":

			doCmdChangeSymbol(output);

		}

		output.setSelection(output.getText().length());

	}

	//更改符号
	private void doCmdChangeSymbol(Text output) {

		String result = output.getText();

		if (result.equals("0"))
			return;

		if (result.startsWith("-")) {
			output.setText(result.substring(1));
		} else {
			output.setText("-" + result);
		}

	}

	//清除输出
	private void doCmdAC(Text output) {

		output.setText("0");
		
		this.inputMode = false;
		this.operator = null;

	}

	//退格
	private void doCmdBS(Text output) {

		if (inputMode == true) {

			String removed = output.getText(0, output.getText().length() - 2);
			if (removed == null || removed.isEmpty()) {
				output.setText("0");
				inputMode = false;
			} else {

				output.setText(removed);

			}
		}

	}

	/**
	 * 二元运算符处理
	 * 
	 * @param event
	 */
	public void onClickBinaryOperator(Event event) {

		Shell shell = event.display.getActiveShell();
		Text output = findOutputText(shell);
		Button button = (Button) event.widget;
		String cmd = button.getText();

		if (operator != null) {	//前步计算没有做等号操作， 先做等号操作
			onClickEq(event);
		}

		String input = output.getText();
		 
		Double leftValue = null;	leftValue = Double.valueOf(input);

		this.operator = Operators.create(cmd, leftValue);
		output.setText(NumberUtils.double2String(leftValue));

		this.inputMode = false;
		output.setSelection(output.getText().length());

	}
	
	//等号事件
	public void onClickEq(Event event) {
		
		Shell shell = event.display.getActiveShell();
		Text output = findOutputText(shell);
		String input = output.getText();

		if (operator!=null) {
			double result = operator.calc(input);
			output.setText(NumberUtils.double2String(result));
			operator = null;
		}
		
		this.inputMode = false;
		output.setSelection(output.getText().length());
		
	}

	//数字输入
	public void onSelectionNumberButton(Event event) {

		Shell shell = event.display.getActiveShell();

		Text output = findOutputText(shell);

		Button button = (Button) event.widget;

		if (inputMode == false) {

			output.setText(button.getText());
			inputMode = true;

		} else {

			output.append(button.getText());
		}

		output.setSelection(output.getText().length());

	}
}
