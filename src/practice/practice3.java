package practice;

public class practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String aString="Madam";
		String reverse="";
		
		for(int i=aString.length()-1;i>=0;i--)
		{
			
			reverse=reverse+aString.charAt(i);
			
			
			
		
		}
		System.out.println(reverse);
		if(aString.equalsIgnoreCase(reverse))
		{
			System.out.println("It is palidrome");
		}
		else {
			System.out.println("Not palidrome");
		}

	}

}
