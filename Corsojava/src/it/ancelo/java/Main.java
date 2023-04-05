package it.ancelo.java;

import it.ancelo.java.animals.Aquila;
import it.ancelo.java.animals.Cane;
import it.ancelo.java.animals.Leone;
import it.ancelo.java.animals.Zebra;

public class Main {

	public static void main(String[] args) {

		Leone leone = new Leone("Leone", "Mammifero", 4, "Rugisce", "Corre", false, false);
		Cane cane = new Cane("Cane", "Mammifero", 4, "Abbaia", "Corre", false, false, true);
		Aquila aquila = new Aquila("Aquila", "Uccello Rapace", 2, "Grida", "Vola", true, true);
		Zebra zebra = new Zebra("Zebra", "Equus", 4, "Raglia", "Corre", true, false);

		leone.verso();
		leone.movimento();
		leone.descrizione();

		cane.verso();
		cane.movimento();
		cane.gioca();
		cane.sentimento();

		aquila.descrizione();
		aquila.verso();
		aquila.movimento();

		zebra.setNome("TEST");
		zebra.descrizione();
		zebra.verso();
		zebra.movimento();

	}

}
