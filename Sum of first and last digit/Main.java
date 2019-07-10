import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      int r,sum=0,d;
      d=num;
      while(num!=0)
      {
        num=num/10;
        if(num<=9 && num>0)
        {
          sum=num;
        }
      }
      r=d%10;
      sum=sum+r;
      System.out.println(sum);
}
}
