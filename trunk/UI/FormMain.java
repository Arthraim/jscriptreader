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
	LeftPanel leftPanel;// ������
	RightPanel rightPanel;// �Ҳ����
    
	public FormMain()
	{
		// ��ʼ������ģ��
		myMenu = new MyMenu();
		leftPanel = new LeftPanel();
		rightPanel = new RightPanel();
		
		// ��������ܵĲ���
		Container c = this.getContentPane();
		c.setLayout(new GridLayout(1,2));
		this.setJMenuBar(myMenu);

		c.add(leftPanel);
		c.add(rightPanel);

		// �����¼�
		this.addWindowListener(new WindowAdapter()
		{
			public void WindowClosing(WindowEvent e)
			{   
			    // �ͷ���Դ���˳�����
				dispose();
				System.exit(0);
			}
		});
		
		setSize(700,500);
		setTitle("JScriptReader");
		setLocation(200,150);
		setVisible(true);
	}
}






