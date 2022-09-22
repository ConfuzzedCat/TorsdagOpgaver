int[][] board = new int[8][8];
int sideLength = 40;
int c = 0;
void setup(){
  size(800,800);
  for(int i = 0; i < board.length; i++){
    for(int j = 0; j < board[i].length; j++){
      board[i][j] = c%2;
      fill(255);
      if(board[i][j] == 1){
        fill(0);
      }
      rect(i*sideLength, j*sideLength, sideLength, sideLength);
      //println(board[i][j]);
      c++;
    }
    c++;
  }
  
}
