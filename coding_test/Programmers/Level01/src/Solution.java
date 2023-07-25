public class Solution {
    public String[] solution(String[] players, String[] callings) {
        
    	for(int i = 0; i<callings.length; i++) {
    		String temp = "";
    		for(int j = 0; j<players.length; j++) {
    			if (callings[i] == players[j]) {
    				temp = players[j];
    				players[j] = players[j-1];
    				players[j-1] = temp;
    			} 
    		}
    	}
    	      
        return players;
    }
}