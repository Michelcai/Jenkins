package fr.esipe.ic.jeuxplusmoins;

import java.util.Random;

public class GameEngine {
	private int min = 1;
	private int max = 100;
	private int random;

	public GameEngine(INbAleatoireService i) {
		i.getRandom();
		this.random = i.getRandom();
	}

	public String plusoumoins(int nb) {
		if (random < nb) {
			return "-";
		} else if (random > nb) {
			return "+";
		} else {
			return "Gagné";
		}
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public int getRandom() {
		return random;
	}

	public void setRandom(int random) {
		this.random = random;
	}

}
