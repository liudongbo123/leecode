package InJava;

import java.util.Stack;

/**
 * @author liudongbo05 <liudongbo05@kuaishou.com>
 * Created on 2020-10-15
 */

//两个stack实现一个队列
public class Q9 {
	public  Stack<Integer> in=null;
	public  Stack<Integer> out=null;

	public Q9() {
		in = new Stack<Integer>();
		out = new Stack<Integer>();
	}

	//in 不变
	public  void appendTail(int value) {
		in.push(value);
	}

	//out 的操作
	public  int deleteHead() {
		if(out.isEmpty()){
			while (!in.isEmpty()){
				out.push(in.pop());
			}
		}
		if(out.isEmpty()){
			return -1;
		}else {
			return out.pop();
		}
	}

	public  static  void main(String []ars){

	}
}
