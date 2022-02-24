package practice;

public class ArmStrong {
	
	public static void main (String[] args) 
	{
		int num = 370;
		int t1 = num;
		int leng=0;
		
		while(t1 != 0) 
		{
			leng = leng+1;
			t1=t1/10;
		}
		int t2=num;
		int rem;
		int arm =0;
		while(t2 != 0) 
		{
			int mul=1;
			rem=t2%10;
			for(int i=1;i<=leng;i++)
			{
				mul=mul*rem;
			}
			arm=arm+mul;
			t2=t2/10;
		}
		if(arm==num) 
		{
			System.out.println("Number is armstrong" +num);
			
		}
		else
		{
			System.out.println("Number is not armstrong" +num);
		}
	}

}
