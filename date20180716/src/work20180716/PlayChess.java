package work20180716;

import org.junit.Test;

public class PlayChess {
	
	@Test
	public void test()
	{
		Chess c = new Chess();
		play(c);
	
		Chess c1 = new cChess();
		play(c1);
		
		Chess c2 = new iChess();
		play(c2);
		
		
	}
	
	public void play(Chess c)
	{
		c.rule();
	}
}
