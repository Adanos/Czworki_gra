package View;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

public class BoardView extends JPanel
{
	private static final long serialVersionUID = -1669512312811136664L;
	private int rowNumber;
	private int columnNumber;
	private Graphics2D[][] boardFieldsGraphics;
	private Rectangle2D.Double[][] rectangles; 

	public BoardView()
	{
	}
	
	public void setRectangle(Rectangle2D.Double[][] rectangles, int rowNumber, int columnNumber)
	{
		setRowNumber(rowNumber);
		setColumnNumber(columnNumber);
		boardFieldsGraphics = new Graphics2D[rowNumber][columnNumber];
		this.rectangles = rectangles;
	}
	
	public void paintComponent(Graphics g)
   {
      setBackground(new Color(80, 40, 40));
      super.paintComponent(g);
      
      for(int i = 0; i < rowNumber; i++)
      {
         for(int j = 0; j < columnNumber; j++)
         {
            boardFieldsGraphics[i][j] = (Graphics2D)g;
            
            if((j + i) % 2 == 0)boardFieldsGraphics[i][j].setPaint(Color.BLUE);
            else boardFieldsGraphics[i][j].setPaint(Color.BLACK);
            
            boardFieldsGraphics[i][j].fill(rectangles[i][j]);
         }
      }
   }
	
	public void run() 
   {
      while (true) 
      {
      	repaint();
      }
   }

	public int getRowNumber()
	{
		return rowNumber;
	}

	private void setRowNumber(int rowNumber)
	{
		this.rowNumber = rowNumber;
	}

	public int getColumnNumber()
	{
		return columnNumber;
	}

	private void setColumnNumber(int columnNumber)
	{
		this.columnNumber = columnNumber;
	}
}
