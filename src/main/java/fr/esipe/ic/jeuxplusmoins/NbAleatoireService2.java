package fr.esipe.ic.jeuxplusmoins;

public class NbAleatoireService2 implements INbAleatoireService  {
private int nb;

public NbAleatoireService2(int nb) {
	this.nb = nb;
}

public int getRandom() {
	return nb;
}

}
