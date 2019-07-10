package com.zhangfei.calc;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;

import java.math.BigDecimal;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Label;

public class CalcApplication {

	protected Shell shell;
	private Text text;
	private Button btn7;
	private Button btn8;
	private Button btn9;
	private Button btn4;
	private Button btn5;
	private Button btn6;
	private Button btn1;
	private Button btn2;
	private Button btn3;
	private Button btn0;
	private Button btnDota;
	private Button btnPlus;
	private Button btnSub;
	private Button btnX;
	private Button btnDivide;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			CalcApplication window = new CalcApplication();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		shell.setSize(542, 467);
		shell.setText("計算器");
		shell.setLayout(new GridLayout(4, false));
		
		
		text = new Text(shell, SWT.BORDER);
		
		GridData gridData = new GridData(SWT.LEFT, SWT.CENTER, true, false);
		gridData.widthHint = 50;
		gridData.heightHint = 50;
		gridData.horizontalSpan = 4;
		text.setLayoutData(gridData);
		
		
		//text.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 4, 1));
		
		Button btnAC = new Button(shell, SWT.FLAT);
		btnAC.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnAC.setText("C");
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		
		btn7 = new Button(shell, SWT.FLAT);
		btn7.setText("7");
		
		btn8 = new Button(shell, SWT.FLAT);
		btn8.setText("8");
		
		btn9 = new Button(shell, SWT.FLAT);
		btn9.setText("9");
		
		btnPlus = new Button(shell, SWT.FLAT);
		btnPlus.setText("+");
		
		btn4 = new Button(shell, SWT.FLAT);
		btn4.setText("4");
		
		btn5 = new Button(shell, SWT.FLAT);
		btn5.setText("5");
		
		btn6 = new Button(shell, SWT.FLAT);
		btn6.setText("6");
		
		btnSub = new Button(shell, SWT.FLAT);
		btnSub.setText("-");
		
		btn1 = new Button(shell, SWT.FLAT);
		btn1.setText("1");
		
		btn2 = new Button(shell, SWT.FLAT);
		btn2.setText("2");
		
		btn3 = new Button(shell, SWT.FLAT);
		btn3.setText("3");
		
		btnX = new Button(shell, SWT.FLAT);
		btnX.setText("×");
		
		btn0 = new Button(shell, SWT.FLAT);
		btn0.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1));
		btn0.setText("0");
		
		btnDota = new Button(shell, SWT.FLAT);
		btnDota.setText(".");
		
		btnDivide = new Button(shell, SWT.FLAT);
		btnDivide.setText("÷");
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);
		new Label(shell, SWT.NONE);

	}
}
