import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int list[]=new int[n];
    int max;
    for(int i=0;i<n;i++)
    {
      list[i]=s.nextInt();
    }
    if(list[0]>list[1])
    {
      max=0;
    }
    else
    {
      max=1;
      }
      for(int i=2;i<=n-1;i++)
      
      if(list[max]<list[i])
      {
        max=i;
      }
      System.out.println(max);
      }
  
      }
