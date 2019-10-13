package com.sperone.manager.helper;

import java.awt.Toolkit;

public class Helper {
	public final static boolean IS_WINDOWS = System.getProperty("os.name").contains("Windows");
	public final static Toolkit ToolkitD = Toolkit.getDefaultToolkit();
	public final static PanelManager PanelM = new PanelManager();
}
