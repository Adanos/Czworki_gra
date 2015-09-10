package Model;

import java.awt.Color;

public class TokenCoin
{
	private volatile int hashCode;
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
	
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj) return true;
		if (!(obj instanceof TokenCoin)) return false;
		TokenCoin tokenCoin = (TokenCoin) obj;
		
		return tokenCoin.value == value && tokenCoin.x == x && tokenCoin.y == y 
				&& tokenCoin.color.equals(color);
	}
	
	@Override
	public int hashCode()
	{
		int result = hashCode;
		int firstPrimeNumber = 19;
		int secondPrimeNumber = 23;
		int modulo = 89;
		
		if (result == 0)
		{
			result = firstPrimeNumber;
			result = (secondPrimeNumber * result + value) % modulo;
			result = (secondPrimeNumber * result + x) % modulo;
			result = (secondPrimeNumber * result + y) % modulo;
			result = (secondPrimeNumber * result + color.hashCode()) % modulo;
			
			hashCode = result;
		}
		
		return result;
	}
	
	@Override
	public String toString()
	{
		String result = "Żeton o wartości " + getValue() + " o współrzędnych [" + getX() + ", " 
							+ getY() + "].";
		
		return result;
	}
}
