import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner s=new Scanner(System.in);
      int num=s.nextInt();
      int ans=(num/10)%10;
      System.out.println(ans);
	}
}