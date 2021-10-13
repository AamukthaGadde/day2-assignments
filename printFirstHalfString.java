public class printFirstHalfString {

	public static void main(String[] args) 
    {		
		String str1 = "Aamuktha Gadde";
		if(str1.contains(" ")) {
			String str2 = str1.substring(0,str1.indexOf(" "));
			System.out.println(str2);
		}
		
		
	}
}
//221810306001 Aamuktha Gadde