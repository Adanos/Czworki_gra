package JUnitTests;

import static org.junit.Assert.*;

import java.awt.Color;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import Model.TokenCoin;
import Strategy.AlphaBetaStrategy;

public class AlphaBetaStrategyTest
{
	@Test
	public void calculateFieldsValue_emptyListFields_returnsAlpha()
	{
		boolean isMaximizingPlayer = true;
		int alpha = -100;
		int beta = 100;
		int depth = 1;
		Set<TokenCoin> tokenCoins = null;
		TokenCoin tokenCoin = new TokenCoin(2, 3, Color.red);
		
		AlphaBetaStrategy alphaBeta = new AlphaBetaStrategy(alpha, beta, tokenCoins);
		int result = alphaBeta.calculateFieldsValue(tokenCoin, depth, alpha, beta, isMaximizingPlayer);
		
		assertEquals("Return value is different than alpha ", result, alpha);
	}
	
	@Test
	public void calculateFieldsValue_emptyListFields_returnsBeta()
	{
		boolean isMaximizingPlayer = false;
		int alpha = -100;
		int beta = 100;
		int depth = 1;
		Set<TokenCoin> tokenCoins = null;
		TokenCoin tokenCoin = new TokenCoin(2, 3, Color.red);
		
		AlphaBetaStrategy alphaBeta = new AlphaBetaStrategy(alpha, beta, tokenCoins);
		int result = alphaBeta.calculateFieldsValue(tokenCoin, depth, alpha, beta, isMaximizingPlayer);
		
		assertEquals("Return value is different than beta ", result, beta);
	}
	
	@Test
	public void calculateFieldsValue_nonEmptyListFields_returnsZero()
	{
		boolean isMaximizingPlayer = true;
		int alpha = -100;
		int beta = 100;
		int depth = 1;
		Set<TokenCoin> tokenCoins = new HashSet<TokenCoin>();
		TokenCoin tokenCoin = new TokenCoin(2, 3, Color.red);
		
		tokenCoins.add(new TokenCoin(3,3, Color.red));
		
		AlphaBetaStrategy alphaBeta = new AlphaBetaStrategy(alpha, beta, tokenCoins);
		int result = alphaBeta.calculateFieldsValue(tokenCoin, depth, alpha, beta, isMaximizingPlayer);
		
		assertEquals("Return value is different than zero ", result, 0);
	}
	
	@Test
	public void calculateFieldsValue_depthsZero_returnsZero()
	{
		boolean isMaximizingPlayer = true;
		int alpha = -100;
		int beta = 100;
		int depth = 0;
		Set<TokenCoin> tokenCoins = new HashSet<TokenCoin>();
		TokenCoin tokenCoin = new TokenCoin(2, 3, Color.red);
		
		tokenCoins.add(new TokenCoin(3,3, Color.red));
		
		AlphaBetaStrategy alphaBeta = new AlphaBetaStrategy(alpha, beta, tokenCoins);
		int result = alphaBeta.calculateFieldsValue(tokenCoin, depth, alpha, beta, isMaximizingPlayer);
		
		assertEquals("Return value is different than default value ", result, 0);
	}

}
