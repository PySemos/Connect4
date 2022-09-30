package connectFour;
import connectFour.Board;
import connectFour.Player;

public class connect4{
   public static void main(String[] args){
      Player player = new Player("S");
      Player player2 = new Player("J");
      Board board = new Board(player,player2);
      board.play(2,player);
      board.play(1,player2);
      board.play(2,player3);
      board.print();
   }
}