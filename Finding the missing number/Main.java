import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int a[]=new int[n];
      for(int i=0;i<=n-1;i++)
      {
        a[i]=s.nextInt();
      }
      int m=0;
      for(int val=1;val<=n;val++)
      {
        boolean is_found=false;
        for(int idx=0;idx<=n-1;idx++)
        {
          if(a[idx]==val)
          {
            is_found=true;
            break;
          }
        }
        if(is_found==false)
        {
          m=val;
          break;
        }
      }
      System.out.println(m);
    }
}
            
       
    