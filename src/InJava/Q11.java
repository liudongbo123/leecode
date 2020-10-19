package InJava;

/**
 * @author liudongbo05 <liudongbo05@kuaishou.com>
 * Created on 2020-10-19
 */
public class Q11 {
	public int minArray(int[] numbers) {
		int len = numbers.length;
		int out = 0;
		for (int i = len-1; i >= 0 ; i--) {
			if(numbers[i]<numbers[i-1]){
				out = numbers[i];
				break;
			}
		}
		return out;
	}

	public  static void main(String []args){

	}
}
