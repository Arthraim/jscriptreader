/**
 * @(#)FormMain.java
 *
 *
 * @author Arthur 
 * @version 1.00 2008/12/15
 *
 *
 * ����������� ����Program���б�ʵ����
 * ��Ҫ����MyMenu LeftPanel RightPanel�ȹ���
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


public class FormMain extends JFrame
{
	// �����ؼ�
	MyMenu myMenu;// �ҵĲ˵���
	GraphPanel graphPanel;// ������
	ScriptPanel scriptPanel;// �Ҳ����
    
	public FormMain()
	{
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// ��ʼ������ģ��
		myMenu = new MyMenu();
		graphPanel = new GraphPanel();
		scriptPanel = new ScriptPanel();
		
		// ��������ܵĲ���
		Container c = this.getContentPane();
		c.setLayout(new GridLayout(1,2));
		this.setJMenuBar(myMenu);

		c.add(graphPanel);
		c.add(scriptPanel);

		setSize(700,500);
		setTitle("JScriptReader");
		setLocation(200,150);
		setVisible(true);
	}
}






