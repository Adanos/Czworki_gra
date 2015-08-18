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

}
