package com.zhangfei.calc;

import java.net.URL;

import org.eclipse.e4.xwt.XWTLoaderManager;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.xwt.IConstants;
import org.eclipse.xwt.XWT;

public class XWTMain {

	public static void main(String args[]) throws Exception {
		
		
		
		URL url = XWTMain.class.getResource(XWTMain.class.getSimpleName() + IConstants.XWT_EXTENSION_SUFFIX);
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
		shell.setBounds(displayArea.width / 4, displayArea.height / 4, displayArea.width / 2, displayArea.height / 2);
	}

}
