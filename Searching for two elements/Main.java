import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      {
        arr[i]=s.nextInt();
      }
      int s1=s.nextInt();
      int s2=s.nextInt();
      int e1=-1;
      int e2=-1;
      for(int i=0;i<n;i++)
      {
        if(s1==arr[i])
        {
          e1=i;
        }
        if(s2==arr[i])
        {
          e2=i;
        }
      }
      System.out.println(e1);
      System.out.println(e2);
    }
}
    
