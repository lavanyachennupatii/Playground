import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner s=new Scanner(System.in);
      int num=s.nextInt();
      int d,sum=0;
      while(num!=0)
      {
        d=num%10;
        sum=sum+d;
        num=num/10;
	}
      System.out.println(sum);
}
}