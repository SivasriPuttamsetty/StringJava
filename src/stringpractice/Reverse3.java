package stringpractice;

public class Reverse3 {

	public static void main(String[] args) {
		String str= "he is a good boy";
		String[] str1= str.split(" ");
		
		String rev="";
		for(int i=0;i<str1.length;i++)
		{
			String words=str1[i];
			String revword=" ";
			for(int j=words.length()-1;j>=0;j--)
			{
				revword=revword+words.charAt(j);
			}
			rev=rev+revword+" ";
		}
		System.out.println("the string words :"+rev);
	}
	

}
