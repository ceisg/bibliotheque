package tp2;

public class BibliothequeAvecTableau {

	private Document[] documents;
	private int nbDoc;

	public BibliothequeAvecTableau(int capacite) {
		this.documents = new Document[capacite];
		this.nbDoc = 0;
	}

	public void ajouter(Document doc) {
		documents[nbDoc] = doc;
		nbDoc++;
		System.out.println(doc.getClass().getSimpleName() + " ajouté ");
	}

	public void supprimerParNum(int num) {
		int pos = -1, i = 0;

		while (pos == -1 && i < nbDoc) {
			if (documents[i].numEnr == num)
				pos = i;
			else
				i++;
		}

		if (pos == -1)
			System.out.println("Le document avec le Numero " + num + " ne se trouve pas dans la bibliothèque");
		else {
			for (i = pos; i < nbDoc - 1; i++)
				documents[i] = documents[i + 1];
			nbDoc--;
			System.out.println(documents[pos].getClass().getSimpleName() + " supprimé ");
		}

	}

	public void supprimerParTitre(String titre) {
		int pos = -1, i = 0;

		while (pos == -1 && i < nbDoc) {
			if (documents[i].titre == titre)
				pos = i;
			else
				i++;
		}

		if (pos == -1)
			System.out.println("Le document avec le titre " + titre + " ne se trouve pas dans la bibliothèque");
		else {
			for (i = pos; i < nbDoc - 1; i++)
				documents[i] = documents[i + 1];
			nbDoc--;
			System.out.println(documents[pos].getClass().getSimpleName() + " supprimé ");
		}
	}

	public int getNbDoc() {
		return nbDoc;
	}

	public Document getDocument(int pos) {

		return documents[pos];
	}

	public Document getDocumentParNum(int num) {

		int i = 0;

		while (i < nbDoc) {
			if (documents[i].numEnr == num)
				return documents[i];
			else
				i++;
		}
		return null;
	}

	public void afficherDocuments() {

		System.out.println("-----------------------" + nbDoc + " documents -------------------------------");

		// 1ère Methode avec for
		for (int i = 0; i < nbDoc; i++)
			System.out.println(documents[i].getClass().getSimpleName() + " :  " + documents[i].toString());

		System.out.println("-------------------------------------------------------------------------------");

	}

	public void afficherAuteurs() {
		System.out.println("----------------------- Les Auteurs -------------------------------");
		for (int i = 0; i < nbDoc; i++)
			if (documents[i] instanceof Livre)
				System.out.println(((Livre) documents[i]).getAuteur());
		System.out.println("--------------------------------------------------------------------");
	}
}
