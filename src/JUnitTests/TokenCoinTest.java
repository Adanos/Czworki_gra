package JUnitTests;

import static org.junit.Assert.*;

import java.awt.Color;
import java.lang.reflect.Field;

import org.junit.Test;

import Model.TokenCoin;

public class TokenCoinTest
{

	@Test
	public void testGetX() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException
	{
		//given
		final int magic_number = 52;
      final TokenCoin tokenCoin = new TokenCoin(2, 2, Color.WHITE);
      final Field field = tokenCoin.getClass().getDeclaredField("x");
      field.setAccessible(true);
      field.set(tokenCoin, magic_number);

      //when
      final int result = tokenCoin.getX();

      //then
      assertEquals("Field is wrong ", result, magic_number);
	}
	
	@Test
	public void testGetY() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException
	{
		//given
		final int magic_number = 25;
      final TokenCoin tokenCoin = new TokenCoin(2, 2, Color.WHITE);
      final Field field = tokenCoin.getClass().getDeclaredField("y");
      field.setAccessible(true);
      field.set(tokenCoin, magic_number);

      //when
      final int result = tokenCoin.getY();

      //then
      assertEquals("Field is wrong ", result, magic_number);
	}
	
	@Test
	public void testGetValue() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException
	{
		//given
		final int magic_number = 33;
      final TokenCoin tokenCoin = new TokenCoin(2, 2, Color.WHITE);
      final Field field = tokenCoin.getClass().getDeclaredField("value");
      field.setAccessible(true);
      field.set(tokenCoin, magic_number);

      //when
      final int result = tokenCoin.getValue();

      //then
      assertEquals("Field is wrong ", result, magic_number);
	}
	
	@Test
	public void testGetColor() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException
	{
		//given
		final Color magic_color = Color.BLACK;
      final TokenCoin tokenCoin = new TokenCoin(2, 2, Color.WHITE);
      final Field field = tokenCoin.getClass().getDeclaredField("color");
      field.setAccessible(true);
      field.set(tokenCoin, magic_color);

      //when
      final Color result = tokenCoin.getColor();

      //then
      assertEquals("Field is wrong ", result, magic_color);
	}
	
	@Test
	public void testSetX() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException
	{
		//given, when (in constructor)
      final TokenCoin tokenCoin = new TokenCoin(2, 3, Color.WHITE);

      //then
      final Field field = tokenCoin.getClass().getDeclaredField("x");
      field.setAccessible(true);
      assertEquals("Fields didn't match ", field.get(tokenCoin), 2);
	}
	
	@Test
	public void testSetY() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException
	{
		//given, when (in constructor)
      final TokenCoin tokenCoin = new TokenCoin(2, 3, Color.WHITE);

      //then
      final Field field = tokenCoin.getClass().getDeclaredField("y");
      field.setAccessible(true);
      assertEquals("Fields didn't match ", field.get(tokenCoin), 3);
	}
	
	@Test
	public void testSetColor() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException
	{
		//given, when (in constructor)
      final TokenCoin tokenCoin = new TokenCoin(2, 3, Color.WHITE);

      //then
      final Field field = tokenCoin.getClass().getDeclaredField("color");
      field.setAccessible(true);
      assertEquals("Fields didn't match ", field.get(tokenCoin), Color.WHITE);
	}

	@Test
	public void testToString()
	{
		String result = "";
		String text = "Żeton o wartości 0 o współrzędnych [2, 5].";
		TokenCoin tokenCoin = new TokenCoin(2, 5, Color.red);
		result = tokenCoin.toString();
		
		assertEquals("Texts are not equal ", result, text);
	}
	
	@Test
	public void testEqualsIdentity()
	{
		TokenCoin tokenCoin = new TokenCoin(2, 3, Color.red);
		
		boolean result = tokenCoin.equals(tokenCoin);
		
		assertEquals("No identity in method equals ", result, true);
	}
	
	@Test
	public void testEqualsSymmetry()
	{
		TokenCoin tokenCoin = new TokenCoin(2, 3, Color.red);
		TokenCoin tokenCoin2 = new TokenCoin(4, 3, Color.red);
		
		boolean result = tokenCoin.equals(tokenCoin2);
		boolean result2 = tokenCoin2.equals(tokenCoin);
		
		assertEquals("No symmetry in method equals ", result, result2);
	}
	
	@Test
	public void testEqualsTransitivity()
	{
		TokenCoin tokenCoin = new TokenCoin(2, 3, Color.red);
		TokenCoin tokenCoin2 = new TokenCoin(2, 3, Color.red);
		TokenCoin tokenCoin3 = new TokenCoin(2, 3, Color.red);
		
		boolean result = tokenCoin.equals(tokenCoin2);
		boolean result2 = tokenCoin2.equals(tokenCoin3);
		boolean result3 = tokenCoin.equals(tokenCoin3);
		
		assertEquals("No transitivity in method equals ", result, true);
		assertEquals("No transitivity in method equals ", result2, true);
		assertEquals("No transitivity in method equals ", result3, true);
	}
	
	@Test 
	public void testEqualsConsistency()
	{
		TokenCoin tokenCoin = new TokenCoin(2, 3, Color.red);
		TokenCoin tokenCoin2 = new TokenCoin(2, 3, Color.red);
		
		boolean result = tokenCoin.equals(tokenCoin2);
		boolean result2 = tokenCoin.equals(tokenCoin2);
		boolean result3 = tokenCoin.equals(tokenCoin2);
		tokenCoin2 = new TokenCoin(2, 3, Color.green);
		boolean result4 = tokenCoin.equals(tokenCoin2);
		boolean result5 = tokenCoin.equals(tokenCoin2);
		
		assertEquals("No consistency in method equals ", result, true);
		assertEquals("No consistency in method equals ", result2, true);
		assertEquals("No consistency in method equals ", result3, true);
		assertEquals("No consistency in method equals ", result4, false);
		assertEquals("No consistency in method equals ", result5, false);
	}
	
	@Test
	public void testEqualsNonNullity()
	{
		TokenCoin tokenCoin = new TokenCoin(1, 3, Color.red);
		boolean result = tokenCoin.equals(null);
		
		assertEquals("NonNullity test in method equals is failed ", result, false);
	}
	
	@Test
	public void testHashCode()
	{
		TokenCoin tokenCoin = new TokenCoin(1, 3, Color.red);
		TokenCoin tokenCoin2 = new TokenCoin(1, 3, Color.red);
		TokenCoin tokenCoin3 = new TokenCoin(1, 3, Color.blue);
		int result = tokenCoin.hashCode();
		int result2 = tokenCoin2.hashCode();
		int result3 = tokenCoin3.hashCode();
		
		assertEquals("Hashcode is different for equal objects ", result, result2);
		assertNotEquals("Hashcode is equal for different objects ", result, result3);
	}
}
