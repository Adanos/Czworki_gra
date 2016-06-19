package Strategy;

public class AlfaBetaStrategy implements IAlgorithmStrategy
{
	private int alfa = -100000000;
	private int beta = 100000000;
	
	public AlfaBetaStrategy(int alfa, int beta)
	{
		this.setAlfa(alfa);
		this.setBeta(beta);
	}
	
	@Override
	public int calculateFieldsValue()
	{
		return 0;
	}

	public int getAlfa()
	{
		return alfa;
	}

	private void setAlfa(int alfa)
	{
		this.alfa = alfa;
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
