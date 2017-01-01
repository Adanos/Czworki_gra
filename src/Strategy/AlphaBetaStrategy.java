package Strategy;

import java.util.Set;

import Model.TokenCoin;

public class AlphaBetaStrategy implements IAlgorithmStrategy
{
	private int alpha = -100000000;
	private int beta = 100000000;
	Set<TokenCoin> tokenCoins;
	
	public AlphaBetaStrategy(int alfa, int beta, Set<TokenCoin> tokenCoins)
	{
		this.setAlfa(alfa);
		this.setBeta(beta);
		this.tokenCoins = tokenCoins;
	}

	@Override
	public int calculateFieldsValue(TokenCoin tokenCoin, int depth, int alpha, int beta,
			boolean isMaximizingPlayer)
	{
		int l_value = 0;
		if (depth == 0) return tokenCoin.getValue();

		l_value = isMaximizingPlayer ? alpha : beta;
		if (tokenCoins == null) return l_value;
		for (TokenCoin element: tokenCoins)
		{
			l_value = calculateFieldsValue(element, depth - 1, alpha, beta, !isMaximizingPlayer);
		}	

		return l_value;
	}
	
	public int getAlfa()
	{
		return alpha;
	}

	private void setAlfa(int alpha)
	{
		this.alpha = alpha;
	}

	public int getBeta()
	{
		return beta;
	}

	private void setBeta(int beta)
	{
		this.beta = beta;
	}
}
