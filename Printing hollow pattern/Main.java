import java.util.Scanner;
class Main {
	public static void main (String[] args){
        Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int i,j;
      for(i=1;i<=n;i++)
      {
        for(j=1;j<=n;j++)
        {
          if( i==1 || i==n || j==1 || j==n)
          {
            System.out.print("*");
          }
          else
          {
            System.out.print(" ");
          }
        }
        System.out.print("\n");
      }
	}
}