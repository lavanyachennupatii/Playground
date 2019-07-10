import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int k=s.nextInt();
      int a[]=new int[n];
      for(int i=0;i<=n-1;i++)
      {
        a[i]=s.nextInt();
      }
      int fre[]=new int[k];
      for(int i=0;i<=k-1;i++)
      {
        fre[i]=0;
      }
      for(int i=0;i<=n-1;i++)
      {
        fre[a[i]-1]++;
      }
      for(int i=0;i<=k-1;i++)
      {
        System.out.println((i+1)+" "+fre[i]);
      }
      
    }
}