package practice;

public class practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//To find how a in the string 
		
		String s="canada";
		int k=0;
		char a []=s.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]=='a') {
				k++;
				
			}
		}
		System.out.println(k);

	}

}
