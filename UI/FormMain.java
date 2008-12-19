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
	//ActionListener GloblePanelActions;

	// �����ؼ�
	MyMenu myMenu;// �ҵĲ˵���
	JPanel leftPanel;// ������
	JPanel rightPanel;// �Ҳ����
	GraphPanel graphPanel;// ͼ�����
	ScriptPanel scriptPanel;// �ű����
	InfoPanel infoPanel;// ��Ϣ���
	
	public FormMain()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// ��ʼ������ģ��
		myMenu = new MyMenu();
		leftPanel = new JPanel();
		rightPanel = new JPanel();
		graphPanel = new GraphPanel();
		scriptPanel = new ScriptPanel();
		infoPanel = new InfoPanel();
				
		// ��������ܵĲ���
		setJMenuBar(myMenu);
		
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new GridLayout(1,2,10,0));
		contentPane.add(leftPanel);
		contentPane.add(rightPanel);
		leftPanel.setLayout(new GridLayout(2,1,0,10));
		leftPanel.add(graphPanel);
		leftPanel.add(infoPanel);
		rightPanel.setLayout(new GridLayout(1,1,0,0));
		rightPanel.add(scriptPanel);

		infoPanel.jb.addActionListener(new GloblePanelActions());

		setSize(960,800);
		setTitle("JScriptReader");
		setLocation(200,150);
		setVisible(true);
	}
	
    class GloblePanelActions implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if((JButton)e.getSource() == infoPanel.jb)
			{
				JOptionPane.showConfirmDialog(null,"Pressed About","title",JOptionPane.YES_OPTION);
				
			}
		} 
	
	}
		

}








