package live;

import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;

public class Test {
	
	public static void main(String[] args) {
		
		Veena v1 = new Veena();
		Saxophone s1 = new Saxophone();
		v1.play();
		s1.play();
		Playable p1;
		p1 = new Veena();
		p1.play();
		p1 = new Saxophone();
		p1.play();
	}
}