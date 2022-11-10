package tp2;

public class Document {
	protected int numEnr;
	protected String titre;

	public Document(int numEnr, String titre) {
		this.numEnr = numEnr;
		this.titre = titre;
	}

	public String toString() {
		return "[numEnr=" + numEnr + ", titre=" + titre + "]";
	}

	public int getNumEnr() {
		return numEnr;
	}

	public String getTitre() {
		return titre;
	}

}
