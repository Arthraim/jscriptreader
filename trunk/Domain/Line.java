/**
 * @(#)Line.java
 *
 *
 * @author Arthur 
 * @version 1.00 2008/12/18
 *
 * ����ģ�� ���� ����
 *
 */

package Domain;

import java.util.*;

public class Line
{
	private long _Index;
	/// �����ţ��кţ�
	public long getIndex() 
	{ 
		return _Index; 
	}
	public void setIndex(long Index)
	{ 
		_Index = Index; 
	}

	private String _Text = null;
	/// ��������
	public String getText() 
	{ 
		return _Text; 
	}
	public void setText(String Text)
	{ 
		_Text = Text; 
	}
}
