package fr.esipe.ic.jeuxplusmoins;

import java.util.Random;

public class NbAleatoireService implements INbAleatoireService {
	private int min, max, random;

	public NbAleatoireService(int min, int max) {
		this.min = min;
		this.max = max;
		Random rand = new Random();
		this.random =  rand.nextInt(max - min + 1) + min;
		
	}

	public int getRandom() {
		return random;
	}

}
