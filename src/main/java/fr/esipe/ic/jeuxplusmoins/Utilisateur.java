package fr.esipe.ic.jeuxplusmoins;

import java.util.Scanner;

public class Utilisateur {
	private String nom;
	private int score;

	public Utilisateur(String nom) {
		this.nom = nom;
	}

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Saisir Nom : ");
		String nom = sc1.nextLine();
		Utilisateur u = new Utilisateur(nom);
		GameEngine g = new GameEngine(new NbAleatoireService(1,100));
		int nb = g.getRandom();
		System.out.println(nb);
		String res = "";
		int bestscore = 0;
		while (res != "Gagné") {
			bestscore++;
			System.out.println("Choisir un nombre : ");
			Scanner sc = new Scanner(System.in);
			int nbsaisie = Integer.parseInt(sc.nextLine());
			res = g.plusoumoins(nbsaisie);
			System.out.println(res);

			if (res == "Gagné") {
				if (bestscore < u.getScore() || u.getScore() == 0) {
					u.setScore(bestscore);
				}
				System.out.println("Gg");
				System.out.println("Votre meilleur score est : " + u.getScore());
				System.out.println("Nouvelle partie");
				Scanner sc2 = new Scanner(System.in);
				String nouv = sc2.nextLine();

				if (nouv.equals("oui")) {
					g = new GameEngine(new NbAleatoireService(1,100));
					System.out.println(g.getRandom());
					bestscore = 0;
					res = "";
				}
			}
		}
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}
