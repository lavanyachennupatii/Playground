import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      while(n!=0)
      {
        if(n>99)
        {
        n=n/10;
        }
        if(n>=10 && n<=99)
        {
          n=n%10;
          break;
        }
      }
        System.out.println(n);
    }
}