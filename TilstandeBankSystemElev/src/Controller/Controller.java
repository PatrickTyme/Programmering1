package Controller;

import Model.Konto;
import Model.KontoType;
import Model.Tilstand;
import Storage.Storage;

public class Controller {

	public static KontoType createKontoType(String navn, String beskrivelse) {

		KontoType kontoType = new KontoType(navn, beskrivelse);
		Storage.addKontoType(kontoType);
		return kontoType;
	}

	public static Konto createKonto(KontoType kontoType) {
		int nr = Storage.getKonti().size()+1;
		Konto konto = new Konto(kontoType,nr);
		Storage.addKonto(konto);

		return konto;
	}

	public static void foretagTransaktion(Konto konto, int beløb) {
		if (konto.getTilstand() == Tilstand.LUKKET) {
			System.out.println("Din konto er lukket, kontakt banken");
		} else {
			try {
				konto.createTransaktion(beløb);
			} catch (RuntimeException exception) {
				System.out.println(exception.getMessage());
			}
		}
	}

	public static void lukKonto(Konto konto) {
		konto.setTilstand(Tilstand.LUKKET);
	}


}
