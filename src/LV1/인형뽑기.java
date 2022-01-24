package LV1;

import java.util.ArrayList;

public class 인형뽑기 {

   public static void main(String[] args) {
      int[][] board = {{0,0,0,0,0,0},{0,0,0,0,0,0},{0,0,1,0,3,0},{0,2,5,0,1,0},{4,2,4,4,2,0},{3,5,1,3,1,0}};
      int[] moves = {1,5,3,5,1,2,1,4,1};
      
      
      int answer = 0;
      ArrayList<Integer> success = new ArrayList<>();
      
      for(int i =0;i<moves.length;i++) {
         
         int b = 0;//몇번째 층에 0이 아닌 숫자가 있는가 찾는거
         while(b<board.length) {
            if(board[b][moves[i]-1]!=0) {
               break;
            }
            b++;
         }
         
         if(b<board.length) {//인형이 있는 경우
            if(success.size()>0&&board[b][moves[i]-1]==success.get(success.size()-1)) {
               answer+=2;
               success.remove(success.size()-1);
            }else {
               success.add(board[b][moves[i]-1]);
            }
            
            board[b][moves[i]-1]=0;
         }
      }
      
      
      System.out.println(answer);
      
      

   }

}
