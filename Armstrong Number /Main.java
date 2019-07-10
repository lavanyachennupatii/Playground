import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int sum=0,o,d;
      o=n;
      while(n!=0)
      {
        d=n%10;
        sum=sum+(d*d*d);
        n=n/10;
      }
      if(o==sum)
      {
        System.out.println("Armstrong Number");
      }
      else
      {
            System.out.println("Not a Armstrong Number");
        
      }      
	}
}