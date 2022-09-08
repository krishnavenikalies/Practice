package practice;



public class practice5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//reverse the number
	/*	int n=1234;
		int rev=0;
		while(n!=0)
		{
			int digit=n%10;//4
			 rev=digit+rev*10;
			 n=n/10;
			 
			
		}
		System.out.println(rev);*/
		
		//reverse string
		
		String str="canada";String rev="";
		
		for(int i=str.length()-1;i>=0;i--)
			
		{
			rev=rev+str.charAt(i);
			//System.out.println(rev);

		}
		System.out.println(rev);

	}
}

