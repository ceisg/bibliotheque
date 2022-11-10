package tp2;

import java.util.Vector;

public class BibliothequeAvecVector {

	private Vector<Document> documents;

	public BibliothequeAvecVector() {
		this.documents = new Vector<Document>();

	}

	public void ajouter(Document doc) {
		documents.add(doc);
		System.out.println(doc.getClass().getSimpleName() + " ajouté ");
	}

	public void supprimerParNum(int num) {
		int pos = -1, i = 0;

		while (pos == -1 && i < documents.size()) {
			if (documents.get(i).numEnr == num)
				pos = i;
			else
				i++;
		}

		if (pos == -1)
			System.out.println("Le document avec le Numero " + num + " ne se trouve pas dans la bibliothèque");
		else {
			documents.remove(pos);

			System.out.println(documents.get(pos).getClass().getSimpleName() + " supprimé ");
		}

	}

	public void supprimerParTitre(String titre) {
		int pos = -1, i = 0;

		while (pos == -1 && i < documents.size()) {
			if (documents.get(i).titre == titre)
				pos = i;
			else
				i++;
		}

		if (pos == -1)
			System.out.println("Le document avec le titre " + titre + " ne se trouve pas dans la bibliothèque");
		else {
			documents.remove(pos);
			System.out.println(documents.get(i).getClass().getSimpleName() + " supprimé ");
		}
	}

	public int getNbDoc() {
		return documents.size();
	}

	public Document getDocument(int pos) {

		return documents.get(pos);
	}

	public Document getDocumentParNum(int num) {

		int i = 0;

		while (i < documents.size()) {
			if (documents.get(i).numEnr == num)
				return documents.get(i);
			else
				i++;
		}
		return null;
	}

	public void afficherDocuments() {

		System.out.println("-----------------------" + documents.size() + " documents -------------------------------");

		// 1ère Methode avec for
		for (int i = 0; i < documents.size(); i++)
			System.out.println(documents.get(i).getClass().getSimpleName() + " :  " + documents.get(i).toString());

		System.out.println("-------------------------------------------------------------------------------");

	}

	public void afficherAuteurs() {
		System.out.println("----------------------- Les Auteurs -------------------------------");
		// 2ème Methode avec foreach
		for (Document doc : documents)
			if (doc instanceof Livre)
				System.out.println(((Livre) doc).getAuteur());
		System.out.println("--------------------------------------------------------------------");
	}
}
