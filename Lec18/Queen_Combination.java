package Lec18;

public class Queen_Combination {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int tq = 2;
		boolean[] board = new boolean[n];
		Printanswer(board, tq, 0, "",0);

	}

	public static void Printanswer(boolean[] board, int tq, int qpsf, String ans,int idx) {
		if (qpsf == tq) {
			System.out.println(ans);
			return;
		}
		for (int i = idx; i < board.length; i++) {

			if (board[i] == false) {
				board[i] = true;
				
				Printanswer(board, tq,qpsf+1, ans + "b" + i + "q"+qpsf,i+1);
				board[i] = false;
			}
		}

	}
}
