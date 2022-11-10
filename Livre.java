package tp2;

public class Livre extends Document {
	protected String auteur;
	protected int nbPage;

	public Livre(int numEnr, String titre, String auteur, int nbPage) {
		super(numEnr, titre);
		this.auteur = auteur;
		this.nbPage = nbPage;
	}

	public String toString() {
		return super.toString() + "[auteur=" + auteur + ", nbPage=" + nbPage + "]";
	}

	public String getAuteur() {
		return auteur;
	}

	public int getNbPage() {
		return nbPage;
	}

}
