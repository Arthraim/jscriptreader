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
 * ��ע�����ܻ�bmp
 */
 
package UI;

import Domain.*;
import Service.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.tree.*;
import javax.swing.event.*;
import javax.swing.border.*;
import javax.swing.table.*;



class GraphPanel extends JPanel
{
	// 1�������¼����ؼ�
	//ActionListener LeftPanelActions;
	
	ImageIcon iconBg;
	ImageIcon iconCt;
	ImageIcon iconFm;
	Image imageBg;
	Image imageCt;
	Image imageFm;
	
	// ��������
	public String CurrentDir = System.getProperty("user.dir",".");
	public String ResPathBg = CurrentDir + "\\DATA\\IMG\\background.jpg";
	public String ResPathCt = CurrentDir + "\\DATA\\IMG\\actor.png";
	public String ResPathFm = CurrentDir + "\\DATA\\IMG\\frame.png";
	
	public GraphPanel()
	{
		initResource();
	}
	
	public void initResource()
	{
        iconBg = new ImageIcon(ResPathBg);
        iconCt = new ImageIcon(ResPathCt);
        iconFm = new ImageIcon(ResPathFm);
	}
		
	public void paintComponent(Graphics g)   
  	{   
  		imageBg = iconBg.getImage();
  		imageCt = iconCt.getImage();
  		imageFm = iconFm.getImage();
      	g.drawImage(imageBg, 0, 0, 480, 360, null);   
      	g.drawImage(imageCt, 0, 0, 210, 360, null);   
      	g.drawImage(imageFm, 105, 180, 375, 180, null);
      	g.setFont(new Font("����",Font.PLAIN,16));
      	g.setColor(Color.black);
      	g.drawString("���Կ��ܲ��ܴ���\n�ܲ��ܻ���", 170, 250);
      	g.drawString("���Կ��ܲ��ܴ���\n�ܲ��ܻ���", 170, 270);
  	}
  	
  	public void setBg(String path) 
  	{
  		ResPathBg = CurrentDir + path;
        iconBg = new ImageIcon(ResPathBg);
  		this.repaint();
  	}
  	
  	public void setCt(String path) 
  	{
  		ResPathCt = CurrentDir + path;
        iconCt = new ImageIcon(ResPathCt);
        this.repaint();
  	}
  	
 	
}