package com.sperone.manager.main;

import javax.swing.JFrame;

import com.sperone.manager.helper.Helper;
import com.sperone.manager.helper.PanelManager;

@SuppressWarnings("serial")
public class Frame extends JFrame {
	
	public Frame() {
		super("XAMPP Sites Manager");
		this.setContentPane(Helper.PanelM.getPanel(PanelManager.MAIN));
		this.setSize(720, 480);
		int width = (Helper.ToolkitD.getScreenSize().width / 2) - (this.getSize().width / 2);
		int height = (Helper.ToolkitD.getScreenSize().height / 2) - (this.getSize().height / 2);
		this.setLocation(width, height);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Frame();
	}
	
}
