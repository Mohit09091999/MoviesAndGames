import java.util.Scanner;
class highest_prime_factor
{
	public static void highestprimefactor(int n)
	{
		//int x=n;
		int i=2;
		int max=-999999;
		boolean b=false;
	  while(n!=1)
	  {
	      max=-999999;
		if(n%i==0)
		{
		   n=n/i;
		}
		else
		{
			b=isprime(i);
			i++;
		}
		if(b==true)
		{
			if(max<i)
			{
				max=i;
			}
		}
	  }
	  System.out.println(max);
	}
	public static boolean isprime(int i)
	{
		int f=0;
		//int i=0;
		for(int j=2;j<Math.sqrt(i);j++)
		{
			if(i%j==0)
			{
             f++;
             break;
			}
		}
		if(f>0){
			return false;
		}
		else
		{
			return true;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		highestprimefactor(n);
	}
}