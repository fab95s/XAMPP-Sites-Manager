package com.sperone.manager.panels;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

@SuppressWarnings("serial")
public class MainPanel extends JPanel {
	private String[] tableHeader = new String[] {"IP", "Server Name", "Path"};
	private JTable table = new JTable(new Object[][] {
		{"127.0.0.1", "example.lcl", "Path/To/Site"}
	}, tableHeader);
	
	public MainPanel() {
		super();
		JScrollPane scrollTable = new JScrollPane(table);
		this.add(scrollTable);
		this.add(new JButton("Add"));
		this.add(new JButton("Remove"));
	}
	
}
