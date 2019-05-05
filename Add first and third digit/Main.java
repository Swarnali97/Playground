import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int c= a/100;
        int d= a%10;
        int r= (c+d);
      System.out.println(r);
	}
}