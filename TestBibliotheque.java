package tp2;

public class TestBibliotheque {

	public static void main(String[] args) {

		BibliothequeAvecTableau bib1 = new BibliothequeAvecTableau(10);
		BibliothequeAvecVector bib2 = new BibliothequeAvecVector();

		Document doc1 = new Document(100, "Cours java");
		Livre l1 = new Livre(200, "Prog. Java Avancee", "M. X", 200);
		Dictionnaire dc1 = new Dictionnaire(300, "Dict Fr Ar", "Fr-Ar");
		Revue r1 = new Revue(40, "Revue de Prog", 10, 2022);
		Manuel m1 = new Manuel(500, "English Book", "Mr. Y", 100, 6);
		Roman rm1 = new Roman(600, "Le royaume perdu", "Jacques Ravenne", 300, "Policier");

		bib2.ajouter(doc1);
		bib2.ajouter(rm1);
		bib2.ajouter(l1);
		bib2.ajouter(dc1);
		bib2.ajouter(m1);

		bib2.afficherDocuments();

		bib2.supprimerParNum(300);
		bib2.afficherDocuments();

		bib2.supprimerParTitre("Cours java");
		bib2.afficherDocuments();

		bib2.afficherAuteurs();

	}

}
