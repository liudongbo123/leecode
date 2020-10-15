package InJava;

import java.util.Scanner;

/**
 * @author liudongbo05 <liudongbo05@kuaishou.com>
 * Created on 2020-10-15
 */
public class Q4 {

	public static boolean findNumberIn2DArray(int[][] matrix, int target) {
		if(matrix == null || matrix[0].length == 0 || matrix.length == 0){
			return  false;
		}
		int i = 1;
		int j = 5;
		while(i>=1 && i<=5 && j>=1 && j<=5){
			if(target == matrix[i][j]){
				return true;
			}
			if(target > matrix[i][j]){
				++i;
			}else{
				--j;
			}
		}
		return false;
	}

	public static void main(String []args){
		Scanner scanner =  new Scanner(System.in);
		int[][] mapp = new int[7][7];
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 5; j++) {
				mapp[i][j] = scanner.nextInt();
			}
		}
		System.out.println(findNumberIn2DArray(mapp,5));
	}
}