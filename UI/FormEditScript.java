/**
 * @(#)FormEditScript.java
 *
 *
 * @author Arthur 
 * @version 1.00 2008/12/22
 *
 *
 * ����Ľű��༭����
 * ����������ã��̳���JDialog
 * �����༭�ű����ݡ�
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



public class FormEditScript extends JDialog
{
	ScriptPanel scriptPanel;
	JPanel panelBtn;
	JButton btnOk;
	JButton btnCancel;
		
	public FormEditScript()
	{
		// ʵ��������
		scriptPanel = new ScriptPanel(22);//��������int��Ϊ�������
		panelBtn = new JPanel();
		btnOk = new JButton("�����޸�");
		btnCancel = new JButton("�رղ������޸�");
		
		// ����
		this.setLayout(new BorderLayout());
		panelBtn.add(btnOk);
		panelBtn.add(btnCancel);
		this.add(panelBtn, BorderLayout.SOUTH);
		this.add(scriptPanel, BorderLayout.CENTER);
		
		// ��Ӽ���
		btnOk.addActionListener(new FormEditScriptActionListener());
		btnCancel.addActionListener(new FormEditScriptActionListener());
		
		setSize(420,500);
		setTitle("�ű��༭��");
		setLocation(200,150);
	}
	
	private void closeDialog()
	{
		this.dispose();
	}
	
    class FormEditScriptActionListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if((JButton)e.getSource() == btnOk)
			{
				scriptPanel.saveScript();
				JOptionPane.showConfirmDialog(null,"�ű��༭�ɹ���\n��رձ����ں����ؽű���","�ű��༭�� ��ʾ",JOptionPane.CLOSED_OPTION);
			}
			if((JButton)e.getSource() == btnCancel)
			{
				closeDialog();
			}
		} 
	}


}