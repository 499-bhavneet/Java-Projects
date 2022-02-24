package Assignment1;

public class primenumbers {
	
	public static void main (String[] args) {
		
		int i , num;
		for(num = 2; num <=100; num++)
		{
			int temp = 0;
			for(i=2;i<=num-1;i++) 
			{
				if(num%i==0)
				{
					temp=temp+1;
				}
				
			}
			if(temp==0) 
			{
				System.out.println(num);
			}
		}
	}
	  
}	   