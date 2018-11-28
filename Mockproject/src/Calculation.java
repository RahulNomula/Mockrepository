import java.util.*;
public class Calculation {

	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
     Scanner s=new Scanner(System.in);
     int a,b;
     a=3;
     b= 2;
     add(a,b);
     mul(a,b);
     sub(a,b);
     module(a,b);
//     mul(a,b);
//     div(a,b);
//     min(a,b);
//     max(a,b);
     }
	public static void add(int a, int b) {
		int res= a+b;
		System.out.println(res);
		
	}
	public static void mul(int a, int b) {
		int res=a*b;
		System.out.println(res);
	}

	public static void sub(int a, int b) {
		int res=a-b;
		System.out.println(res);
	}
	
	
	public static void module(int a, int b){
		int mod = a%b;
		System.out.println(mod);
	}

}
