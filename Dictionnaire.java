package tp2;

public class Dictionnaire extends Document {

	private String langue;

	public Dictionnaire(int numEnr, String titre, String langue) {
		super(numEnr, titre);
		this.langue = langue;
	}

	public String getLangue() {
		return langue;
	}

	public String toString() {
		return super.toString() + "[langue=" + langue + "]";
	}

}
