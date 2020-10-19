package InJava;

import java.util.Scanner;

/**
 * @author liudongbo05 <liudongbo05@kuaishou.com>
 * Created on 2020-10-19
 */
public class Q10II {
	//跳台阶，变相的斐波那契远离，f(n) = f(n-1) + f(n-2);
	//嘻嘻
	public static int numWays(int n) {
		 if(n==0){
		 	return 1;
		 }else if(n==1 || n==2){
		 	return n;
		 }
		 int a = 1;
		 int b = 2;
		 int out = 0;
		for (int i = 3; i <= n; i++) {
			out = a + b;
			a=b;
			b=out%1000000007;
		}
		return out%1000000007;
	}

	public static void main(String []args){
		Scanner scanner = new Scanner(System.in);
		System.out.println(numWays(scanner.nextInt()));
	}
}
