import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //Type your code here
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int count=0;
    for(int i=1;i<=n;i++)
    {
      count=count+1;
       System.out.print(i); 
      if(count%3==0 && count%n!=0)
      {
        System.out.print(",");
      }
  }
  }
}