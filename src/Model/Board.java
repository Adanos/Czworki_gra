package Model;

public class Board
{
	private int rowNumber;
	private int columnNumber;
	
	public Board(int rowNumber, int columnNumber)
	{
		this.rowNumber = rowNumber;
		this.columnNumber = columnNumber;
	}
	
	public int getRowNumber()
	{
		return rowNumber;
	}

	public int getColumnNumber()
	{
		return columnNumber;
	}
	
	@Override
	public String toString()
	{
		StringBuilder stringBuilder = new StringBuilder("Plansza o wymiarach ");
		stringBuilder.append(getRowNumber());
		stringBuilder.append(" na ");
		stringBuilder.append(getColumnNumber());
		stringBuilder.append(".");
		
		return stringBuilder.toString();
	}
}
