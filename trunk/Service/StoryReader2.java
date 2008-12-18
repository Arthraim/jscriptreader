using System;
using System.Collections.Generic;
using System.Text;
using System.IO;
using ScriptReader.Domain;

namespace ScriptReader.Service
{
    public class StoryReader2
    {
        private string currentDir = AppDomain.CurrentDomain.BaseDirectory;

        /// <summary>
        /// ���ȫ���Ĺ���
        /// </summary>
        /// <returns>���ع��¶���</returns>
        public Story2 GetWholeStory()
        {
            Story2 story = new Story2();
            StreamReader SR = new StreamReader(currentDir + @"DATA\AVGS\story.avgs", Encoding.GetEncoding("GB2312"));
            string tempStr;
            int index = 1;
            while ((tempStr = SR.ReadLine()) != null)
            {
                Line newLine = new Line();
                newLine.index = index;
                newLine.text = tempStr;
                story.content.Add(newLine);
                index++;
            }
            story.LineNumber = index - 1;
            return story;
        }

    }
}
