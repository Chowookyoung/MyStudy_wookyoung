package LV1;
import java.util.Random;

public class Solution {
 
    public int[] solution(int[] lottos, int[] win_nums) {
    	
    	Random rd = new Random();
        
        lottos = new int[6];
        win_nums = new int[6];
        
        for(int i=0;i<6;i++){
            int lotto =0;
            int win_num = 0;
            while(true){
                lotto = rd.nextInt(46);
                if(lotto!=0){
                    for(int j=0;j<i;j++){
                        if(lottos[j]==lotto){
                            lotto=-1;
                        }
                    }
                }
                
                if(lotto!=-1){
                    lottos[i]=lotto;
                    break;
                }
            }
            
            while(true){
                win_num = rd.nextInt(45)+1;
                for(int j=0;j<i;j++){
                    if(win_nums[j]==win_num){
                        lotto=-1;
                    }
                }      
                if(win_num!=-1){
                    win_nums[i]=win_num;
                    break;
                }
            }
        }
    	
        int same_count=0;
        int zero_count=0;
        
        for(int i=0;i<6;i++){
            if(lottos[i]!=0){
                for(int j=0;j<6;j++){
                    if(lottos[i]==win_nums[j]){
                        same_count++;
                    }
                }
            }else{
                zero_count++;
            }
            
        }
        
        int min = 6;
        int max = 7-(same_count+zero_count);
        
        if(same_count>1){
            min = 7-same_count;
        }else{
            min = 6;
        }
        
        int[] answer = {max,min};
        
        
        return answer;
    }
}
