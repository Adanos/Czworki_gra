package Model;

public class Board
{
	private final int SIZE_FIELD = 75;

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
	
	public int getSizeField()
	{
		return SIZE_FIELD;
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
