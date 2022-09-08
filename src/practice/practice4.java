package practice;

import java.util.Scanner;

public class practice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//prime no or not 
		
		
		
	
		 Scanner input = new Scanner(System.in);
	       System.out.print("Enter number  :");
	        int num = input.nextInt(); 
	        
	        boolean flag=false;
	//	int  num=27;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				flag=true;
				break;
			}
			
		}
		if(!flag)
		{
			System.out.println(" prime"+ num);
		}
		else {
			System.out.println("Not prime"+num);
		}

		input.close();

	
	  }
	
		  

	}


