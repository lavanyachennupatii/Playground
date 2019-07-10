import java.util.Scanner;
class Main{
  public static boolean isprime(int m)
  {
    boolean isprime=true;
    for(int n=2;n<=m/2;n++)
    {
      if(m%n==0)
      {
        isprime=false;
        break;
      }
    }
    return isprime;
  }
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int k=s.nextInt();
    for(int i=2;i<=k;i++)
    {
      if(isprime(i))
      {
        System.out.println(i);
      }
    }
  }
}
