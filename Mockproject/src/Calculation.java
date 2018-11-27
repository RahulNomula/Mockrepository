import java.util.*;
public class Calculation {

	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
     Scanner s=new Scanner(System.in);
     int a,b;
     a= s.nextInt();
     b= s.nextInt();
     add(a,b);
     mul(a,b);
//     sub(a,b);
//     mul(a,b);
//     div(a,b);
//     min(a,b);
//     max(a,b);
     }
	public static int add(int a, int b) {
		int res= a+b;
		return res;
	}
	public static void mul(int a, int b) {
		int res=a*b;
		System.out.println(res);
	}
	public static void sub(int a, int b) {
		int res=a-b;
		System.out.println(res);
	}
}
