package stringpractice;

public class Reverse2 {

	public static void main(String[] args) {
		
		String str= "he is a good boy";
		String[] str1= str.split(" ");
		String rev=" ";
		for(int i=str1.length-1;i>=0;i--)
		{
			rev+=str1[i] + " ";
		}
		
		
		System.out.println("the reverse of a string: "+rev);
		
		
	}

}
