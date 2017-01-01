package Strategy;

import Model.TokenCoin;

public interface IAlgorithmStrategy
{
	int calculateFieldsValue(TokenCoin tokenCoin, int depth, int alpha, int beta, 
			boolean isMaximizingPlayer);
}
