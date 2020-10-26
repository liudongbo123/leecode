package InJava;

/**
 * @author liudongbo05 <liudongbo05@kuaishou.com>
 * Created on 2020-10-26
 */
public class Q12 {
		//标记是否走过
		public  static boolean isOk[][] = new boolean[210][210];
		// 移动方向
		public static int  running[][] = {{1,0},{-1,0},{0,1},{0,-1}};

		public static boolean findString(char[][] board, String word, int m,int n,int len){
			if(len == word.length()-1){
				return true;
			}
			isOk[m][n] = true;
			for (int k = 0; k < 4; k++) {
				int ii = m + running[k][0];
				int jj = n + running[k][1];
				if(ii>=0 && ii<board.length && jj>=0 && jj<board[0].length && isOk[ii][jj] == false && board[ii][jj] == word.charAt(len+1)){
					if(findString(board,word,ii,jj,len+1)){return true;}
				}
			}
			isOk[m][n] = false;
			return false;
		}

		public static boolean exist(char[][] board, String word) {
			for (int i = 0; i < board.length; i++) {
				for (int j = 0; j < board[i].length; j++) {
					if(board[i][j] == word.charAt(0)){
						for (int ii = 0; ii < isOk.length; ii++) {
							for (int jj = 0; jj < isOk.length; jj++) {
								isOk[ii][jj] = false;
							}
						}
						if(findString(board,word,i,j,0) == true){
							return true;
						}
					}
				}
			}
			return false;
		}
}
