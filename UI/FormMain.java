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

import Domain.*;
import Service.*;

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
	GraphPanel graphPanel;// ͼ�����
	ScriptPanel scriptPanel;// �ű����
	InfoPanel infoPanel;// ��Ϣ���
	
	JButton btnStart;
	
	public FormMain()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// ��ʼ������ģ��
		myMenu = new MyMenu();
		graphPanel = new GraphPanel();
		scriptPanel = new ScriptPanel();
		infoPanel = new InfoPanel();
		btnStart = new JButton("��ʼִ��");
				

		// ��������ܵĲ���
		setJMenuBar(myMenu);// �˵�
		Container contentPane = this.getContentPane();
		contentPane.setLayout(null);
		graphPanel.setBounds(12,12,480,360);
		this.add(graphPanel);
		infoPanel.setBounds(12,378,480,150);
		this.add(infoPanel);
		scriptPanel.setBounds(500,12,250,456);
		this.add(scriptPanel);
		btnStart.setBounds(500,474,250,23);
		this.add(btnStart);

		// ����¼�����
		btnStart.addActionListener(new GloblePanelActions());
		
		setSize(770,570);
		setTitle("JScriptReader");
		setLocation(200,150);
		setVisible(true);
	}
	
    class GloblePanelActions implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if((JButton)e.getSource() == btnStart)
			{
				graphPanel.setBg("\\DATA\\SCENE\\0000.jpg");
			}
		} 
	}
	
	void initResource()
	{
		//����ű��ϵ�һ��
	}
	
	void mainLoop()
	{
		//��Ϸ��ѭ��
	}
	
	
		

}








