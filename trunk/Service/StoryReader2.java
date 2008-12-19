/**
 * @(#)StoryReader2.java
 *
 *
 * @author Arthur 
 * @version 1.00 2008/12/19
 *
 * ���� ���� �ű���ȡ
 *
 */
 
package Service;

import Domain.*;
import java.io.*;
import java.util.*;

public class StoryReader2
{
	public String CurrentDir = System.getProperty("user.dir",".");

    /// ���ȫ���Ĺ���
    /// ���ع��¶���
    public Story2 GetWholeStory()
    {
  	    Story2 story = new Story2();
  		try
    	{
			FileReader reader = new FileReader(CurrentDir + "\\DATA\\AVGS\\story.avgs");
		    BufferedReader br = new BufferedReader(reader);
	        String tempStr;
	        int index = 1;
	        while ((tempStr = br.readLine()) != null)
	        {
	            Line newLine = new Line();
	            newLine.setIndex(index);
	            newLine.setText(tempStr);
	            story.getContent().add(newLine);
	            index++;
	        }
	        story.setLineNumber(index - 1);
    	}
    	catch (Exception ex)
    	{
    		return null;
    	}
        return story;
    }

}

