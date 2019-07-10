import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int o,d,mul,sum=0;
      o=n;
      while(n!=0)
      {
      d=n%10;
      mul=1;
      for(int i=1;i<=d;i++)
      {
        mul=mul*i;
      }
      sum=sum+mul;
      n=n/10;
    }
  if(o==sum)
  {
    System.out.println("Yes");
	}
      else
      {
        
    System.out.println("No");
      }
    }
}