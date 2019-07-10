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
      int left=0;
      int right=n-1;
      boolean is_palindrome=true;
      while(left<=right)
      {
        if(a[left]!=a[right])
        {
          is_palindrome=false;
          break;
        }
        left++;
        right--;
      }
      if(is_palindrome==true)
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
    }
}
   