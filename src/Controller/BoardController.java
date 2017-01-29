package Controller;

import java.awt.geom.Rectangle2D;

import Model.Board;
import View.BoardView;

public class BoardController
{
	private int rowNumber;
	private int columnNumber;
	private Board model;
	private BoardView view;
	private Rectangle2D.Double[][] rectangles; 
	
	public BoardController(Board model, BoardView view)
	{
		setModel(model);
		setView(view);
		
		rowNumber = model.getRowNumber();
		columnNumber = model.getColumnNumber();
		setRectangles(new Rectangle2D.Double[rowNumber][columnNumber]);
	}
	
	public void run()
	{
		createRectangles();
		view.setRectangle(rectangles, rowNumber, columnNumber);
	}
	
	private void createRectangles()
	{
		int x = 50;
		int y = 100;
		
		for (int i = 0; i < rowNumber; i++)
      {
			x = 50;
			
         for (int j = 0; j < columnNumber; j++)
         {
         	rectangles[i][j] = new Rectangle2D.Double(x, y, 
      				model.getSizeField(), model.getSizeField());
         	
         	x += model.getSizeField();
         }
         
         y += model.getSizeField();
      }
	}

	public Board getModel()
	{
		return model;
	}

	private void setModel(Board model)
	{
		this.model = model;
	}

	public BoardView getView()
	{
		return view;
	}

	private void setView(BoardView view)
	{
		this.view = view;
	}

	public Rectangle2D.Double[][] getRectangles()
	{
		return rectangles;
	}

	private void setRectangles(Rectangle2D.Double[][] rectangles)
	{
		this.rectangles = rectangles;
	}
}
