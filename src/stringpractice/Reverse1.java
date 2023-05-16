package stringpractice;

public class Reverse1 {

	public static void main(String[] args) {
		String str= "he is a good boy";
		String rstr="";
		int len=str.length();
		for(int i=len-1; i>=0;i--)
		{
			rstr=rstr+str.charAt(i);
		}
	
	System.out.println("the reversed string is : "+rstr);
	}
	

}
