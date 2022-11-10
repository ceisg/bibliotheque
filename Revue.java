package tp2;

public class Revue extends Document {
	private int mois, annee;

	public Revue(int numEnr, String titre, int mois, int annee) {
		super(numEnr, titre);
		this.mois = mois;
		this.annee = annee;
	}

	public String toString() {
		return super.toString() + "[mois=" + mois + ", annee=" + annee + "]";
	}

	public int getMois() {
		return mois;
	}

	public int getAnnee() {
		return annee;
	}

}
