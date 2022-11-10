package tp2;

public class Roman extends Livre {

	private String type;

	public Roman(int numEnr, String titre, String auteur, int nbPage, String type) {
		super(numEnr, titre, auteur, nbPage);
		this.type = type;
	}

	public String toString() {
		return super.toString() + "[type=" + type + "]";
	}

	public String getType() {
		return type;
	}

}
