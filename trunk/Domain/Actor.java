/**
 * @(#)Actor.java
 *
 *
 * @author Arthur 
 * @version 1.00 2008/12/18
 *
 * ����ģ�� ���� ��ɫ
 *
 */

package Domain;

import java.util.*;

public class Actor
{
	private String _ID;
	/// ��ɫID
	public String getID() 
	{ 
		return _ID; 
	}
	public void setID(String ID)
	{ 
		_ID = ID; 
	}

	private String _Name;
	/// ��ɫ����
	public String getName() 
	{ 
		return _Name; 
	}
	public void setName(String Name)
	{ 
		_Name = Name; 
	}
	
	private String _Path;
	/// ��ɫ·��
	public String getPath() 
	{ 
		return _Path; 
	}
	public void setPath(String Path)
	{ 
		_Path = Path; 
	}

	private LinkedList<Face> _FaceList = new LinkedList<Face>();
	/// ��ɫ���鼯��
	public LinkedList<Face> getFaceList() 
	{ 
		return _FaceList; 
	}
	public void setFaceList(LinkedList<Face> FaceList)
	{ 
		_FaceList = FaceList; 
	}
}

