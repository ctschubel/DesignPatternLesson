package section_2.lesson_1;

import java.io.File;
/**
 * @author ctschubel
 *
 */
public class Application {

	public static void main(final String[] args) {
		EinkaufsListe ek = new EinkaufsListe();
		PersistanceService ps = new PersistanceService();

		ek.addEntry("Apfel");
		ek.addEntry("Kaffee");
		ek.addEntry("Chips");

		System.out.println(ek.toString());

		ps.persistArrayList(ek.getEntries(), new File("output/einkaufsListe.txt"));

	}

}
