import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int i;
      for(i=1;i<=n;i++)
      {
        
       if(i%2!=0)
       {
         System.out.println(i);
       }
	}
}
}