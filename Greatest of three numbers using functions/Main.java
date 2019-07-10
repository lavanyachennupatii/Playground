import java.util.Scanner;
public class Main{
	public static void main (String args[])
	{
        Scanner s=new Scanner(System.in);
      int n1=s.nextInt();
      int n2=s.nextInt();
      int n3=s.nextInt();
      int result=greatest_of_2numbers(n1,n2);
      System.out.println(result);
    }
  public static int greatest_of_2numbers(int n1,int n2)
  {
    int max=0;
    if(n1>n2)
       {
    max=n1;
       }
       else
       {
       max=n2;
       }
  
    return max;
  }
}
  
      