public class printFirstHalfOfString {

	public static void main(String[] args) 
    {		
		String str1 = "Aamuktha Gadde";
		if(str1.contains(" ")) 
		{
			String str2 = str1.substring(0,str1.indexOf(" "));
			System.out.println(str2);
		}
		String alpha = "abcdefghijk";
		int len = alpha.length();
		System.out.println(alpha.substring(0,len/2));
		
		
	}
}
//221810306001 Aamuktha Gadde