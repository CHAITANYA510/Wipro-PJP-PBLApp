abstract class Instrument{
	abstract void play();
}

class Piano extends Instrument{
	public void play() {
		System.out.println("Piano is playing  tan tan tan tan");
	}
}

class Flute extends Instrument{
	public void play() {
		System.out.println("Flute is playing  toot toot toot toot");
	}
}

class Guitar extends Instrument{
	public void play() {
		System.out.println("Guitar is playing  tin  tin  tin");
	}
}


public class testInstrument {

	public static void main(String[] args) {
	
		Instrument[] intstrument = new Instrument[10];
		
		intstrument[0] = new Piano();
		intstrument[1] = new Flute();
		intstrument[2] = new Guitar();
		intstrument[3] = new Flute();
		intstrument[4] = new Guitar();
		intstrument[5] = new Piano();
		intstrument[6] = new Piano();
		intstrument[7] = new Piano();
		intstrument[8] = new Flute();
		intstrument[9] = new Guitar();
		
		for(int i=0;i<10;i++) {
			
			if(intstrument[i] instanceof Piano) {
				intstrument[i].play();
			}
			else if(intstrument[i] instanceof Flute) {
				intstrument[i].play();
			}
			else if(intstrument[i] instanceof Guitar) {
				intstrument[i].play();
			}
		}
	}
}
