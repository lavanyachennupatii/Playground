import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
    Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<=n-1;i++)
      {
        arr[i]=s.nextInt();
      }
      int k=s.nextInt();
      sort(n,arr);
      System.out.println(arr[n-k]);
    }
  public static void sort(int n,int arr[])
  {
    for(int s=0;s<=n-2;s++)
    {
      int min=f(s,arr,n-1);
      swap(s,min,arr);
    }
  }
  public static void swap(int s,int min,int arr[]){
    int temp=arr[s];
  arr[s]=arr[min];
  arr[min]=temp;
}
public static int f(int s,int arr[],int end)
{
  int min=0;
if(arr[s]<arr[s+1])
{
  min=s;
}
else
{
  min=s+1;
}
for(int i=s+2;i<=end;i++)
{
  if(arr[min]>arr[i])
  {
    min=i;
  }
}
return min;   
}
}