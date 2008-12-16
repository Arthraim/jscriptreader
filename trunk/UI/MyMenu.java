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

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.tree.*;
import javax.swing.event.*;
import javax.swing.border.*;
import javax.swing.table.*;

 
class MyMenu extends JMenuBar
{
	// 1�������¼����ؼ�
	ActionListener MyMenuActions;
	
	JMenu fileMenu;
	JMenu helpMenu;
	JMenuItem reloadMenuItem;
	JMenuItem closeMenuItem;
	JMenuItem exitMenuItem;
	JMenuItem aboutMenuItem;
	
	
	public MyMenu()
	{
		// 2��ʵ�����¼�
		fileMenu = new JMenu("�ļ�");
		helpMenu = new JMenu("����");
		reloadMenuItem = new JMenuItem("���ؽű�",KeyEvent.VK_E);
		closeMenuItem = new JMenuItem("�رսű�",KeyEvent.VK_A);			
		exitMenuItem = new JMenuItem("�˳�",KeyEvent.VK_E);
		aboutMenuItem = new JMenuItem("����...",KeyEvent.VK_A);			
											
		fileMenu.add(reloadMenuItem);
		fileMenu.add(closeMenuItem);
		fileMenu.addSeparator();
		fileMenu.add(exitMenuItem);
		helpMenu.add(aboutMenuItem);
		this.add(fileMenu);	
		this.add(helpMenu);
	

	
		// 3��ʵ�����¼�
		MyMenuActions = new ActionListener()
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
				if((JMenuItem)e.getSource() == exitMenuItem)
				{
					//dispose();
					System.exit(0);
				}
			} 
		};
		
		// 4����ӿؼ����¼�����
		reloadMenuItem.addActionListener(MyMenuActions);
		closeMenuItem.addActionListener(MyMenuActions);
		aboutMenuItem.addActionListener(MyMenuActions);
		exitMenuItem.addActionListener(MyMenuActions);
		
	}
}