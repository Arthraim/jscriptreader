/**
 * @(#)Story2.java
 *
 *
 * @author Arthur 
 * @version 1.00 2008/12/18
 *
 * ����ģ�� ���� �籾�����м��ϣ�
 *
 */

package Domain;

import java.util.*;

public class Story2
{
	private LinkedList<Line> _Content = new LinkedList<Line>();
	/// ȫ���ű���Ϣ
	public LinkedList<Line> getContent() 
	{ 
		return _Content; 
	}
	public void setContent(LinkedList<Line> Content)
	{ 
		_Content = Content; 
	}

	private long _LineNumber;;
	/// �ű�������
	public long getLineNumber() 
	{ 
		return _LineNumber; 
	}
	public void setLineNumber(long LineNumber)
	{ 
		_LineNumber = LineNumber; 
	}

	/// ��������������
	public String GetTextByIndex (long index)
	{
		Line tempLine = (Line)_Content.get((int)index);
		String tempString = tempLine.getText();
		return null;
	}
}

