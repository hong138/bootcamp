class Solution {
  public int numPlayersWinningGame(int n, int[][] pick) {
    int[] pick = new int [[0,0],[1,0],[1,0],[2,1],[2,1],[2,0]];
    
    int[] wins = new int[n]; // Array to track wins for each player
    int[][] colorCount = new int[n][11]; // 0 <= yi <= 10 (assuming colors range from 0 to 10)
    int ret = new Solution().numPlayersWinningGame(4, pick);
    
    for (int i = 0; i < pick.length; i++) {
        int player = pick[i][0];
        int color = pick[i][1];
        colorCount[player][color]++;
        for (int j = 0; j <= player; j++) {
            if (colorCount[player][color] > j) {
                wins[j]++;
            }
        }
    }
    int numWinners = 0;
    for (int win : wins) {
        if (win > 0) {
            numWinners++;
        }
    }
    return numWinners;
  }
}
