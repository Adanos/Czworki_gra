package Model;

public enum Direction
{
	LeftDiagonal(6),
	RightDiagonal(7),
	Horizontal(8),
	Vertical(1);
	
	private final int value;
	
	Direction(int value)
	{
		this.value = value;
	}

	public int getValue()
	{
		return value;
	}
}
