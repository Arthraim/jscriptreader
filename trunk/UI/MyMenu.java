/**
 * @(#)MyMenu.java
 *
 *
 * @author Arthur 
 * @version 1.00 2008/12/17
 *
 *
 * �˵���ģ�� 
 * JMenuBar����MyMenu���Լ���ز�������ڴ�
 *
 *
 */
 
package UI;

import Domain.*;
import Service.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.tree.*;
import javax.swing.event.*;
import javax.swing.border.*;
import javax.swing.table.*;



 
class MyMenu extends JMenuBar
{
	FormMain myParent;
	
	// �����ؼ�
	JMenu fileMenu;
	JMenu ctrlMenu;
	JMenu helpMenu;
	JMenuItem reloadMenuItem;
	JMenuItem closeMenuItem;
	JMenuItem editMenuItem;
	JMenuItem exitMenuItem;
	JMenuItem colorMenuItem;
	JMenuItem fontMenuItem;
	JMenuItem aboutMenuItem;
	
	public MyMenu(FormMain parent)
	{
		myParent = parent;
		// ʵ�����¼�
		fileMenu = new JMenu("�ļ�");
		ctrlMenu = new JMenu("����");
		helpMenu = new JMenu("����");
		reloadMenuItem = new JMenuItem("���ؽű�");
		closeMenuItem = new JMenuItem("�رսű�");			
		editMenuItem = new JMenuItem("�༭�ű�");
		exitMenuItem = new JMenuItem("�˳�");
		colorMenuItem = new JMenuItem("����������ɫ");
		fontMenuItem = new JMenuItem("������������");
		aboutMenuItem = new JMenuItem("����...");			
									
		reloadMenuItem.addActionListener(new MyMenuActionListener());
		closeMenuItem.addActionListener(new MyMenuActionListener());
		exitMenuItem.addActionListener(new MyMenuActionListener());
		editMenuItem.addActionListener(new MyMenuActionListener());
		colorMenuItem.addActionListener(new MyMenuActionListener());
		fontMenuItem.addActionListener(new MyMenuActionListener());
		aboutMenuItem.addActionListener(new MyMenuActionListener());
											
		fileMenu.add(reloadMenuItem);
		fileMenu.add(closeMenuItem);
		fileMenu.addSeparator();
		fileMenu.add(editMenuItem);
		fileMenu.addSeparator();
		fileMenu.add(exitMenuItem);
		ctrlMenu.add(colorMenuItem);
		ctrlMenu.add(fontMenuItem);
		//ctrlMenu.addSeparator();
		helpMenu.add(aboutMenuItem);
		this.add(fileMenu);	
		this.add(ctrlMenu);	
		this.add(helpMenu);
	}
	
	class MyMenuActionListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e) 
		{
			if((JMenuItem)e.getSource() == reloadMenuItem)
			{
				myParent.scriptPanel.clearScript();
				myParent.scriptPanel.PrintScript();
			}
			if((JMenuItem)e.getSource() == closeMenuItem)
			{
				myParent.scriptPanel.scriptText.setText("");
			}
			if((JMenuItem)e.getSource() == editMenuItem)
			{
				FormEditScript frmES = new FormEditScript();
				frmES.setVisible(true);
			}
			if((JMenuItem)e.getSource() == aboutMenuItem)
			{
				FormAbout frmAbout = new FormAbout();
				frmAbout.setVisible(true);
			}
			if((JMenuItem)e.getSource() == colorMenuItem)
			{
				setGrapicTextColor();
			}
			if((JMenuItem)e.getSource() == fontMenuItem)
			{
				setGraphicTextFont();
			}
			if((JMenuItem)e.getSource() == exitMenuItem)
			{
				System.exit(0);
			}
		} 
	}
	
	private void MessageBox(String text, String title)
	{
		JOptionPane.showConfirmDialog(null,text,title,JOptionPane.CLOSED_OPTION);
	}
	
	private void setGrapicTextColor()
	{
		JColorChooser chooser = new JColorChooser();
		Color newColor;
		newColor = chooser.showDialog(null, "����������ɫ", myParent.graphPanel.getColor());
		myParent.graphPanel.setColor(newColor);
	}
	
	private void setGraphicTextFont()
	{
		Font font = myParent.graphPanel.getFont();   
		font = NwFontChooserS.showDialog(null,"������������",font);
		myParent.graphPanel.setFont(font);
	}
}