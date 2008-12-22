/**
 * @(#)FormAbout.java
 *
 *
 * @author Arthur 
 * @version 1.00 2008/12/22
 *
 *
 * ����Ĺ��ڴ���
 * ����������ã��̳���JDialog
 * ��ʾ������Ϣ��
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
import java.lang.*;



public class FormAbout extends JDialog
{
	private String aboutStr = 	
		"JScriptReader\n\n" + 
		"Produced by ������\n\n" +
		"�������ǻ���AVGmaker�е��Թ���ScriptReader��д�ģ�\n" +
		"ԭ�汾��������1.5�棬����������๦�ܡ�\n" +
		"��������������϶Խ��桢���ܶ���һ�����޸ġ��򻯣�\n" +
		"�����Դﵽ��ƽ̨���Խű������á�\n\n" +
		"�������Ѿ���Դ����ӭʹ���߷��ʡ�������\n" +
		"http://code.google.com/p/jscriptreader/\n" +
		"ͬʱ��dotnet��AVGreaderҲ�Ѿ���Դ��\n" + 
		"http://code.google.com/p/avgreader/\n" +
		"Ҳ��ӭ��ע�ҵ�������Դ��Ŀ��";
		
		
	JButton btnOk;
	JScrollPane scrollPane;
	JTextArea textAbout;
	JLabel eImage;
	ImageIcon iImage;
		
	public FormAbout()
	{
		this.setLayout(null);
		
		// ʵ�����ؼ�
		textAbout = new JTextArea();
		textAbout.setLineWrap(true);
		textAbout.setEditable(false);
		textAbout.setText(aboutStr);
		scrollPane = new JScrollPane(textAbout);
		btnOk = new JButton("ȷ��");
		iImage = new ImageIcon(System.getProperty("user.dir",".") + "\\DATA\\IMG\\logo.jpg");
		eImage = new JLabel(iImage);
		
		// ��ӿؼ�
		scrollPane.setBounds(12,12,340,283);
		this.add(scrollPane);
		btnOk.setBounds(358,261,160,34);
		this.add(btnOk);
		eImage.setBounds(358,12,160,80);
		this.add(eImage);
		
		// ����¼�
		btnOk.addActionListener(new FormAboutActionListener());
	
		setSize(538,340);
		setResizable(false);
		setTitle("����JScriptReader");
		setLocation(200,150);
	}

	private void closeDialog()
	{
		this.dispose();
	}
	
    class FormAboutActionListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if((JButton)e.getSource() == btnOk)
			{
				closeDialog();
			}
		} 
	}
}
