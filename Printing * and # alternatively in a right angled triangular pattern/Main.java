import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int num=0;
      for(int i=1;i<=n;i++)
      {
        for(int j=1;j<=i;j++)
        {
         num=num+1;
          if(num%2==0)
          {
          System.out.print("#");
          }
          else
          {
            System.out.print("*");
          }
        }
        System.out.print("\n");
      }
	}
}