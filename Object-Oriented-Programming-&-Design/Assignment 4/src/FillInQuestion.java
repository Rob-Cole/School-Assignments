import java.util.Scanner;

public class FillInQuestion extends Question
{
	public void setTxt(String txt) {
		int index = txt.indexOf("_");
		setText(txt.substring(0, index-1));
	}
	
	public void setAns(String txt) {
		int startIndex = txt.indexOf("_")+1;
		int endIndex = txt.length()-1;
		setAnswer(txt.substring(startIndex, endIndex));
	}
}
