package tp2;

public class TestDocuments {

	public static void main(String[] args) {

		Document doc1 = new Document(100, "Cours java");
		Livre l1 = new Livre(200, "Prog. Java Avancee", "M. X", 200);
		Dictionnaire dc1 = new Dictionnaire(300, "Dict Fr Ar", "Fr-Ar");
		Revue r1 = new Revue(40, "Revue de Prog", 10, 2022);
		Manuel m1 = new Manuel(500, "English Book", "Mr. Y", 100, 6);
		Roman rm1 = new Roman(600, "Le royaume perdu", "Jacques Ravenne", 300, "Policier");

		System.out.println(doc1.toString());
		System.out.println(l1.toString());
		System.out.println(dc1.toString());
		System.out.println(r1.toString());
		System.out.println(m1.toString());
		System.out.println(rm1.toString());

	}

}
