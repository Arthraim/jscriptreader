/**
 * @(#)MyMenu.java
 *
 *
 * @author Arthur 
 * @version 1.00 2008/12/17
 *
 *
 * 菜单栏模块 
 * JMenuBar派生MyMenu，以及相关操作完成于此
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



 
class MyMenu extends JMenuBar implements ActionListener
{
	// 声明控件
	JMenu fileMenu;
	JMenu helpMenu;
	JMenuItem reloadMenuItem;
	JMenuItem closeMenuItem;
	JMenuItem exitMenuItem;
	JMenuItem aboutMenuItem;
	
	public MyMenu()
	{
		// 实例化事件
		fileMenu = new JMenu("文件");
		helpMenu = new JMenu("帮助");
		reloadMenuItem = new JMenuItem("重载脚本",KeyEvent.VK_E);
		closeMenuItem = new JMenuItem("关闭脚本",KeyEvent.VK_A);			
		exitMenuItem = new JMenuItem("退出",KeyEvent.VK_E);
		aboutMenuItem = new JMenuItem("关于...",KeyEvent.VK_A);			
											
		fileMenu.add(reloadMenuItem);
		fileMenu.add(closeMenuItem);
		fileMenu.addSeparator();
		fileMenu.add(exitMenuItem);
		helpMenu.add(aboutMenuItem);
		this.add(fileMenu);	
		this.add(helpMenu);
	}
	
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
}