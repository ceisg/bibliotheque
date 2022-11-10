package tp2;

public class Manuel extends Livre {
	private int nivScol;

	public Manuel(int numEnr, String titre, String auteur, int nbPage, int nivScol) {
		super(numEnr, titre, auteur, nbPage);
		this.nivScol = nivScol;
	}

	public int getNivScol() {
		return nivScol;
	}

	public String toString() {
		return super.toString() + "[nivScol=" + nivScol + "]";
	}

}
