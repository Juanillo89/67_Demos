package demos;

public class Subdemo extends Demo 
{
	int atr3 = 2;
	int atr4 = 4;
	@Override
	public void baila() 
	{
		atr3 = atr4 - atr3;
		System.out.println(atr3);
	}

}
