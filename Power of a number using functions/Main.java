import java.util.Scanner;
class Main{
  public static int power(int n,int m)
  {
    int power=1;
    while(m>=1)
    {
      power=power*n;
      m--;
    }
    return power;
  }
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int m=s.nextInt();
    System.out.println(power(n,m));
  }
}
