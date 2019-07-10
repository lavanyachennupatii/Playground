import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
        Scanner s=new Scanner(System.in);
      int n1=s.nextInt();
      int n2=s.nextInt();
      int n3=s.nextInt();
      int result=gcd(n1,n2);
      System.out.println(result);
	    // Type your code here
	}
  public static int gcd(int n1,int n2)
  {
    int min;
    if(n1<n2)
    {
      min=n1;
    }
    else
    {
      min=n2;
    }
    while(min>=1)
    {
      if((n1%min==0) && (n2%min==0))
      {
        return min;
      }
      min--;
    }
    return 0;
  }
}

