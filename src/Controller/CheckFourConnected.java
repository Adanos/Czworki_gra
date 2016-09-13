/*
 * Algorithm from:
 *  https://stackoverflow.com/questions/7033165/algorithm-to-check-a-connect-four-field/7053051#7053051
 * */
package Controller;

import Model.Direction;

public class CheckFourConnected implements ICheckFourConnected
{
	public CheckFourConnected()
	{
	}

	@Override
	public boolean isFourConnected(long bitboard)
	{
		if (computeBitboardValue(bitboard, Direction.RightDiagonal) > 0)
			return true;
		
		if (computeBitboardValue(bitboard, Direction.LeftDiagonal) > 0)
			return true;
		
		if (computeBitboardValue(bitboard, Direction.Horizontal) > 0)
			return true;
		
		if (computeBitboardValue(bitboard, Direction.Vertical) > 0)
			return true;
	   
		return false;
	}

	private long computeBitboardValue(long bitboard, Direction direction)
	{
		int value = direction.getValue();
		long diagonalLeft = bitboard & (bitboard >> value);
		
	   return diagonalLeft & (diagonalLeft >> 2 * value);
	}
}
