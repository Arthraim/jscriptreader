/**
 * @(#)GraphPanel.java
 *
 *
 * @author Arthur 
 * @version 1.00 2008/12/17
 *
 *
 * ͼ����ʾģ�� 
 * ����paintComponent�¼��е�Graphic�����ͼ��
 *
 *
 */
 
package UI;

import javax.swing.*;
import java.awt.*;
import java.io.*;
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


class GraphPanel extends JPanel
{
	// 1�������¼����ؼ�
	//ActionListener LeftPanelActions;
	Image image;
	ImageIcon icon;
	
	// ��������
	public String ResPath = "I:\\GoogleCode\\jscriptreader\\table.jpg";
	
	public GraphPanel()
	{
		init();
	}
	
	public void init()
	{
        icon = new ImageIcon(ResPath);
	}
		
	public void paintComponent(Graphics g)   
  	{   
  		image = icon.getImage();
      	g.drawImage(image, 10, 10, null);   
  	}   
}