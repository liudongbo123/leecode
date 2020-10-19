package InJava;

import java.util.Scanner;

/**
 * @author liudongbo05 <liudongbo05@kuaishou.com>
 * Created on 2020-10-19
 */
public class Q10 {
	public static  int fib(int n) {
		if(n==0){
			return 0;
		}else if(n==1 || n==2){
			return 1;
		}
		int a = 0;
		int b = 1;
		int out = 0;
		for (int i = 2; i <= n; i++) {
			out = a + b;
			a = b;
			b = out;
		}
		return out;
	}
	public static void main(String []args){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(fib(n));
	}
}
