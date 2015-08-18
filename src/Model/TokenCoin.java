package Model;

import java.awt.Color;

public class TokenCoin
{
	private int value;
	private int x;
	private int y;
	private Color color;
	
	private final int INIT_VALUE = 0;
	private static final int DIAMETER = 50;
	
	public TokenCoin(int x, int y, Color color)
	{
		setX(x);
		setY(y);
		setColor(color);
		setValue(INIT_VALUE);
	}
	
	public int getDiameter()
	{
		return DIAMETER;
	}

	public int getValue()
	{
		return value;
	}

	private void setValue(int value)
	{
		this.value = value;
	}

	public int getX()
	{
		return x;
	}

	private void setX(int x)
	{
		this.x = x;
	}

	public int getY()
	{
		return y;
	}

	private void setY(int y)
	{
		this.y = y;
	}

	public Color getColor()
	{
		return color;
	}

	private void setColor(Color color)
	{
		this.color = color;
	}
	
}
