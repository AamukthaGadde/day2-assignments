public class checkPalindrome 
{
	public static void main(String[] args) 
    {
		String s1 = "mom";
		String s2 = "Hello";
		StringBuffer abc = new StringBuffer(s1);
		StringBuffer def = new StringBuffer(s2);;
		abc.reverse();
		def.reverse();
		String data1 = abc.toString();
		String data2 = def.toString();
		System.out.println(s1.equals(data1));
		System.out.println(s2.equals(data2));
	}

}