import java.util.Scanner;

public class 인형뽑기 {

	public static void main(String[] args) {
		int[][] board = {{0,0,0,0,0,0},{0,0,0,0,0,0},{0,0,1,0,3,0},{0,2,5,0,1,0},{4,2,4,4,2,0},{3,5,1,3,1,0}};
		//board[bord.length-1] = {n,n,n,n,n,n,n};
		int[] moves = {1,5,3,5,1,2,1,4,1};
		//board[n][moves[i]]�� ������ �����µ� n�� ó������ 0�� �ƴ� ĭ�� �ε�����.
		int answer = 0;
		//�����̱⸦ �ϸ鼭 ����� ������ ������
		
		
		//board[n][moves[i]]�� ���� 0�� �ƴҰ�� success[j]�� ������ �ִµ�
		//���� board[n][moves[i]] == sucess[j-1]�� ��� j-=2; & answer+=2;
		//�ֳ��ϸ� j++�̶�� for���ȿ� �����ϱ�
		//�װ� �ƴ϶�� success[j] = board[n][moves[i]] �ϰ� board[n][moves[i]]=0;
		
		int[] success = new int[moves.length];//������ ��� ������ ���� �迭�̴�.
		
		//j�� �����̱⸦ �̾Ƽ� ���� ���� ����
		for(int i =0,j=0;i<moves.length;i++,j++) {
			int b = 0;//���° ���� 0�� �ƴ� ���ڰ� �ִ°� ã�°�
			while(b<board.length) {
				if(board[b][moves[i]-1]!=0) {
					break;
				}
				b++;
			}
			if(b<board.length) {//������ �ִ� ���
				if(j>0&&board[b][moves[i]-1]==success[j-1]) {
					j-=2;
					answer+=2;
				}else {
					success[j] = board[b][moves[i]-1];
				}
				board[b][moves[i]-1]=0;
			}else {//������ ���� ���
				j--;
			}
		}
		System.out.println(answer);
		
		

	}

}
