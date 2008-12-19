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
	// �����ؼ�
	JMenu fileMenu;
	JMenu ctrlMenu;
	JMenu helpMenu;
	JMenuItem reloadMenuItem;
	JMenuItem closeMenuItem;
	JMenuItem exitMenuItem;
	JMenuItem editMenuItem;
	JMenuItem aboutMenuItem;
	
	public MyMenu()
	{
		// ʵ�����¼�
		fileMenu = new JMenu("�ļ�");
		ctrlMenu = new JMenu("�ű�");
		helpMenu = new JMenu("����");
		reloadMenuItem = new JMenuItem("���ؽű�");
		closeMenuItem = new JMenuItem("�رսű�");			
		exitMenuItem = new JMenuItem("�˳�");
		editMenuItem = new JMenuItem("�༭�ű�");
		aboutMenuItem = new JMenuItem("����...");			
									
		reloadMenuItem.addActionListener(new MyMenuActionListener());
		closeMenuItem.addActionListener(new MyMenuActionListener());
		exitMenuItem.addActionListener(new MyMenuActionListener());
		editMenuItem.addActionListener(new MyMenuActionListener());
		aboutMenuItem.addActionListener(new MyMenuActionListener());
											
		fileMenu.add(reloadMenuItem);
		fileMenu.add(closeMenuItem);
		fileMenu.addSeparator();
		fileMenu.add(exitMenuItem);
		ctrlMenu.add(editMenuItem);
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
				JOptionPane.showConfirmDialog(null,"Pressed Reload","title",JOptionPane.YES_OPTION);
			}
			if((JMenuItem)e.getSource() == closeMenuItem)
			{
				JOptionPane.showConfirmDialog(null,"Pressed Close","title",JOptionPane.YES_OPTION);
			}
			if((JMenuItem)e.getSource() == aboutMenuItem)
			{
				JOptionPane.showConfirmDialog(null,"Pressed About","title",JOptionPane.YES_OPTION);
			}
			if((JMenuItem)e.getSource() == editMenuItem)
			{
				JOptionPane.showConfirmDialog(null,"Pressed Edit","title",JOptionPane.YES_OPTION);
			}
			if((JMenuItem)e.getSource() == exitMenuItem)
			{
				//dispose();
				System.exit(0);
			}
		} 
	}
}