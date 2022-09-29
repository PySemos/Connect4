package connectFour;
import connectFour.Board;
import connectFour.Player;

public class connect4{
   public static void main(String[] args){
      Player player = new Player("S");
      Board board = new Board();
      board.play(2,player);
      board.print();
   }
}