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
		shell.setSize(450, 300);
		shell.setText("SWT Application");
		shell.setLayout(new FormLayout());
		
		Button btnAC = new Button(shell, SWT.FLAT);
		FormData fd_btnAC = new FormData();
		fd_btnAC.bottom = new FormAttachment(0, 89);
		fd_btnAC.right = new FormAttachment(0, 50);
		fd_btnAC.top = new FormAttachment(0, 59);
		fd_btnAC.left = new FormAttachment(0, 10);
		btnAC.setLayoutData(fd_btnAC);
		btnAC.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnAC.setText("C");
		
		text = new Text(shell, SWT.BORDER);
		FormData fd_text = new FormData();
		fd_text.bottom = new FormAttachment(0, 53);
		fd_text.right = new FormAttachment(0, 440);
		fd_text.top = new FormAttachment(0, 10);
		fd_text.left = new FormAttachment(0, 10);
		text.setLayoutData(fd_text);
		
		btn7 = new Button(shell, SWT.FLAT);
		FormData fd_btn7 = new FormData();
		fd_btn7.bottom = new FormAttachment(0, 138);
		fd_btn7.right = new FormAttachment(0, 50);
		fd_btn7.top = new FormAttachment(0, 108);
		fd_btn7.left = new FormAttachment(0, 10);
		btn7.setLayoutData(fd_btn7);
		btn7.setText("7");
		
		btn8 = new Button(shell, SWT.FLAT);
		FormData fd_button = new FormData();
		fd_button.bottom = new FormAttachment(0, 138);
		fd_button.right = new FormAttachment(0, 100);
		fd_button.top = new FormAttachment(0, 108);
		fd_button.left = new FormAttachment(0, 60);
		btn8.setLayoutData(fd_button);
		btn8.setText("8");
		
		btn9 = new Button(shell, SWT.FLAT);
		FormData fd_button_1 = new FormData();
		fd_button_1.bottom = new FormAttachment(0, 138);
		fd_button_1.right = new FormAttachment(0, 157);
		fd_button_1.top = new FormAttachment(0, 108);
		fd_button_1.left = new FormAttachment(0, 117);
		btn9.setLayoutData(fd_button_1);
		btn9.setText("9");
		
		btn4 = new Button(shell, SWT.FLAT);
		FormData fd_button_2 = new FormData();
		fd_button_2.bottom = new FormAttachment(0, 178);
		fd_button_2.right = new FormAttachment(0, 50);
		fd_button_2.top = new FormAttachment(0, 148);
		fd_button_2.left = new FormAttachment(0, 10);
		btn4.setLayoutData(fd_button_2);
		btn4.setText("4");
		
		btn5 = new Button(shell, SWT.FLAT);
		FormData fd_button_3 = new FormData();
		fd_button_3.bottom = new FormAttachment(0, 178);
		fd_button_3.right = new FormAttachment(0, 100);
		fd_button_3.top = new FormAttachment(0, 148);
		fd_button_3.left = new FormAttachment(0, 60);
		btn5.setLayoutData(fd_button_3);
		btn5.setText("5");
		
		btn6 = new Button(shell, SWT.FLAT);
		FormData fd_button_4 = new FormData();
		fd_button_4.bottom = new FormAttachment(0, 174);
		fd_button_4.right = new FormAttachment(0, 157);
		fd_button_4.top = new FormAttachment(0, 144);
		fd_button_4.left = new FormAttachment(0, 117);
		btn6.setLayoutData(fd_button_4);
		btn6.setText("6");
		
		btn1 = new Button(shell, SWT.FLAT);
		FormData fd_button_5 = new FormData();
		fd_button_5.bottom = new FormAttachment(0, 231);
		fd_button_5.right = new FormAttachment(0, 50);
		fd_button_5.top = new FormAttachment(0, 201);
		fd_button_5.left = new FormAttachment(0, 10);
		btn1.setLayoutData(fd_button_5);
		btn1.setText("1");
		
		btn2 = new Button(shell, SWT.FLAT);
		FormData fd_button_6 = new FormData();
		fd_button_6.bottom = new FormAttachment(0, 231);
		fd_button_6.right = new FormAttachment(0, 100);
		fd_button_6.top = new FormAttachment(0, 201);
		fd_button_6.left = new FormAttachment(0, 60);
		btn2.setLayoutData(fd_button_6);
		btn2.setText("2");
		
		btn3 = new Button(shell, SWT.FLAT);
		FormData fd_button_7 = new FormData();
		fd_button_7.bottom = new FormAttachment(0, 231);
		fd_button_7.right = new FormAttachment(0, 161);
		fd_button_7.top = new FormAttachment(0, 201);
		fd_button_7.left = new FormAttachment(0, 121);
		btn3.setLayoutData(fd_button_7);
		btn3.setText("3");
		
		btn0 = new Button(shell, SWT.FLAT);
		FormData fd_button_8 = new FormData();
		fd_button_8.bottom = new FormAttachment(0, 278);
		fd_button_8.right = new FormAttachment(0, 115);
		fd_button_8.top = new FormAttachment(0, 248);
		fd_button_8.left = new FormAttachment(0, 10);
		btn0.setLayoutData(fd_button_8);
		btn0.setText("0");
		
		btnDota = new Button(shell, SWT.FLAT);
		FormData fd_button_9 = new FormData();
		fd_button_9.bottom = new FormAttachment(0, 278);
		fd_button_9.right = new FormAttachment(0, 157);
		fd_button_9.top = new FormAttachment(0, 248);
		fd_button_9.left = new FormAttachment(0, 117);
		btnDota.setLayoutData(fd_button_9);
		btnDota.setText(".");
		
		btnPlus = new Button(shell, SWT.FLAT);
		FormData fd_button_10 = new FormData();
		fd_button_10.bottom = new FormAttachment(0, 138);
		fd_button_10.right = new FormAttachment(0, 239);
		fd_button_10.top = new FormAttachment(0, 108);
		fd_button_10.left = new FormAttachment(0, 199);
		btnPlus.setLayoutData(fd_button_10);
		btnPlus.setText("+");
		
		btnSub = new Button(shell, SWT.FLAT);
		FormData fd_button_11 = new FormData();
		fd_button_11.bottom = new FormAttachment(0, 178);
		fd_button_11.right = new FormAttachment(0, 239);
		fd_button_11.top = new FormAttachment(0, 148);
		fd_button_11.left = new FormAttachment(0, 199);
		btnSub.setLayoutData(fd_button_11);
		btnSub.setText("-");
		
		btnX = new Button(shell, SWT.FLAT);
		FormData fd_btnX = new FormData();
		fd_btnX.bottom = new FormAttachment(0, 219);
		fd_btnX.right = new FormAttachment(0, 239);
		fd_btnX.top = new FormAttachment(0, 189);
		fd_btnX.left = new FormAttachment(0, 199);
		btnX.setLayoutData(fd_btnX);
		btnX.setText("×");
		
		btnDivide = new Button(shell, SWT.FLAT);
		FormData fd_button_13 = new FormData();
		fd_button_13.bottom = new FormAttachment(0, 268);
		fd_button_13.right = new FormAttachment(0, 239);
		fd_button_13.top = new FormAttachment(0, 238);
		fd_button_13.left = new FormAttachment(0, 199);
		btnDivide.setLayoutData(fd_button_13);
		btnDivide.setText("÷");

	}
}
