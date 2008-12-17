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
	InfoPanel infoPanel;// �м����
    
	public FormMain()
	{
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// ��ʼ������ģ��
		myMenu = new MyMenu();
		graphPanel = new GraphPanel();
		scriptPanel = new ScriptPanel();
		infoPanel = new InfoPanel();
		
		// ��������ܵĲ���
		Container c = this.getContentPane();
		c.setLayout(new GridLayout(1,3));
		this.setJMenuBar(myMenu);

		c.add(graphPanel);
		c.add(infoPanel);
		c.add(scriptPanel);

		setSize(700,500);
		setTitle("JScriptReader");
		setLocation(200,150);
		setVisible(true);
	}
}






