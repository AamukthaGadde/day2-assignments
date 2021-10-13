import java.util.*;
public class exchange2Characters 
{
	public static void main(String[] args) 
    {
		String ex1 = "abcdefgh";
		char[] ex2 = ex1.toCharArray();
		int x = ex2[0];
		int y = ex2[1];
		ex2[0]=ex2[2];
		ex2[1]=ex2[3];
		ex2[2]=(char)x;
		ex2[3]=(char)y;
		System.out.println(ex2);
		

	}

}
//221810306001 Aamuktha Gadde