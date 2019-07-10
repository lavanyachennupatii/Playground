import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int f=n/100;
    int sc=(n/10)%10;
    int t=n%10;
    int rev=(t*100)+(sc*10)+f;
    System.out.println(rev);
  }
}