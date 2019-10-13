package com.sperone.manager.helper;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JPanel;

public class PanelManager {
	public static String MAIN = "MainPanel";
	
	private Map<String, JPanel> panels = new HashMap<String, JPanel>();
	
	public JPanel getPanel(String panelName) {
		if(!panels.containsKey(panelName)) {
			try {
				JPanel gp = (JPanel) Class.forName("com.sperone.manager.panels." + panelName).newInstance();
				panels.put(panelName, gp);
			} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		return panels.get(panelName);
	}
}
