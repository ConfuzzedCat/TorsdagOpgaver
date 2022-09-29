int[][] board = new int[8][8];
int sideLength = 100;
void setup(){
  size(800,800);
  for(int i = 0; i < board.length; i++){
    for(int j = 0; j < board[i].length; j++){
      board[i][j] = (i+j)%2;
      fill(255);
      if(board[i][j] == 1){
        fill(0);
      }
      int x = i*sideLength;
      int y = j*sideLength;
      rect(x, y, sideLength, sideLength);
    }
  }
}
