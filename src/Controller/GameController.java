package Controller;

import Model.Board;
import View.BoardView;
import View.GameWindow;

public class GameController
{
	private GameWindow gameWindow;
	private Board board;
	private BoardView boardView;
	private BoardController boardController;
	
	public GameController()
	{
		board = new Board(6, 7);
		boardView = new BoardView();
		boardController = new BoardController(board, boardView);
		gameWindow = new GameWindow(boardView);
	}
	
	public void run()
   {
		boardController.run();
		boardView.run();
   }
}
