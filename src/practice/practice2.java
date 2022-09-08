package practice;

import java.util.Scanner;

public class practice2 {
	public static void main(String[] args) {
		
		String aString="Welcome";
		int ba=1234;
		/*String bString="Canada";
		
		String cString=aString.concat(bString);
		System.out.println(cString);
		
		StringBuffer bStringBuffer=new StringBuffer(bString);
		System.out.println(bStringBuffer.reverse());
		
		
		StringBuilder builder=new StringBuilder(aString);
		System.out.println(builder.append(bString));
		StringBuilder c=builder.reverse();
		System.out.println(c);*/
		char a[]=aString.toCharArray();
		
	int sum = 0;
		
		for(int i=a.length-1;i>=0;i--)
			
		{
			System.out.print(a[i]);
		}
		//Reverse the number 
	/*	int value;
		while(ba>0) {
		value=ba%10;//4
		
		ba=ba/10;//123
		
		 System.out.print(value);
		}*/
		

		
		
		/*   Scanner input = new Scanner(System.in);
	        System.out.print("Enter number  :");
	        int num = input.nextInt(); 
	        System.out.print("Reverse number   :");
	        int value;
	        while( num > 0){
	            value = num % 10;
	            num  /=  10;
	            System.out.print(value);  //value = Reverse
	            
	             }*/
	}
}
