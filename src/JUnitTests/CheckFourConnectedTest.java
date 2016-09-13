package JUnitTests;

import static org.junit.Assert.*;

import org.junit.Test;

import Controller.CheckFourConnected;

public class CheckFourConnectedTest
{
	@Test
	public void isFourConnected_initialBitBoard_returnsFalse()
	{
		CheckFourConnected checkFourConnected = makeCheckFourConnected();
		boolean result = checkFourConnected.isFourConnected(0);
		
		assertEquals(false, result);
	}
	
	@Test
	public void isFourConnected_checkDiagonalLeft_returnsFalse()
	{
		long bitboard = 0;
		CheckFourConnected checkFourConnected = makeCheckFourConnected();
		boolean result = checkFourConnected.isFourConnected(bitboard);
		
		assertEquals(false, result);
	}
	
	@Test
	public void isFourConnected_checkDiagonalLeft_returnsTrue()
	{
		long bitboard = (long) (Math.pow(2, 3) + Math.pow(2, 9) + Math.pow(2, 15) + Math.pow(2, 21));
		CheckFourConnected checkFourConnected = makeCheckFourConnected();
		boolean result = checkFourConnected.isFourConnected(bitboard);
		
		assertEquals(true, result);
	}
	
	@Test
	public void isFourConnected_checkDiagonalRight_returnsFalse()
	{
		long bitboard = 0;
		CheckFourConnected checkFourConnected = makeCheckFourConnected();
		boolean result = checkFourConnected.isFourConnected(bitboard);
		
		assertEquals(false, result);
	}
	
	@Test
	public void isFourConnected_checkDiagonalRight_returnsTrue()
	{
		long bitboard = (long) (Math.pow(2, 0) + Math.pow(2, 8) + Math.pow(2, 16) + Math.pow(2, 24));
		CheckFourConnected checkFourConnected = makeCheckFourConnected();
		boolean result = checkFourConnected.isFourConnected(bitboard);
		
		assertEquals(true, result);
	}
	
	@Test
	public void isFourConnected_checkHorizontal_returnsFalse()
	{
		long bitboard = 0;
		CheckFourConnected checkFourConnected = makeCheckFourConnected();
		boolean result = checkFourConnected.isFourConnected(bitboard);
		
		assertEquals(false, result);
	}
	
	@Test
	public void isFourConnected_checkHorizontal_returnsTrue()
	{
		long bitboard = (long) (Math.pow(2, 0) + Math.pow(2, 7) + Math.pow(2, 14) + Math.pow(2, 21));
		CheckFourConnected checkFourConnected = makeCheckFourConnected();
		boolean result = checkFourConnected.isFourConnected(bitboard);
		
		assertEquals(true, result);
	}
	
	@Test
	public void isFourConnected_checkVertical_returnsFalse()
	{
		long bitboard = 0;
		CheckFourConnected checkFourConnected = makeCheckFourConnected();
		boolean result = checkFourConnected.isFourConnected(bitboard);
		
		assertEquals(false, result);
	}
	
	@Test
	public void isFourConnected_checkVertical_returnsTrue()
	{
		long bitboard = (long) (Math.pow(2, 0) + Math.pow(2, 1) + Math.pow(2, 2) + Math.pow(2, 3));
		CheckFourConnected checkFourConnected = makeCheckFourConnected();
		boolean result = checkFourConnected.isFourConnected(bitboard);
		
		assertEquals(true, result);
	}
	
	private static CheckFourConnected makeCheckFourConnected()
	{
		return new CheckFourConnected();
	}
}
