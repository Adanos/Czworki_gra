package JUnitTests;

import static org.junit.Assert.*;
import java.lang.reflect.Field;
import org.junit.Test;
import Model.Board;

public class BoardTest
{
	@Test
	public void testGetColumnNumber() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException
	{
		//given
		final int rowNumber = 4;
		final int columnNumber = 5;
      final Board board = new Board(rowNumber, columnNumber);
      final Field field = board.getClass().getDeclaredField("columnNumber");
      field.setAccessible(true);
      field.set(board, columnNumber);

      //when
      final int result = board.getColumnNumber();

      //then
      assertEquals("Field is wrong ", result, columnNumber);
	}
	
	@Test
	public void testSetColumnNumber() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException
	{
		//given, when (in constructor)
		final int rowNumber = 4;
		final int columnNumber = 5;
      final Board board = new Board(rowNumber, columnNumber);

      //then
      final Field field = board.getClass().getDeclaredField("columnNumber");
      field.setAccessible(true);
      assertEquals("Fields didn't match ", field.get(board), columnNumber);
	}
	
	@Test
	public void testGetRowNumber() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException
	{
		//given
		final int rowNumber = 4;
		final int columnNumber = 5;
      final Board board = new Board(rowNumber, columnNumber);
      final Field field = board.getClass().getDeclaredField("rowNumber");
      field.setAccessible(true);
      field.set(board, rowNumber);

      //when
      final int result = board.getRowNumber();

      //then
      assertEquals("Field is wrong ", result, rowNumber);
	}
	
	@Test
	public void testSetRowNumber() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException
	{
		//given, when (in constructor)
		final int rowNumber = 4;
		final int columnNumber = 5;
      final Board board = new Board(rowNumber, columnNumber);

      //then
      final Field field = board.getClass().getDeclaredField("rowNumber");
      field.setAccessible(true);
      assertEquals("Fields didn't match ", field.get(board), rowNumber);
	}
}
