
public class TausendMinutenRennen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Auto[] autos = new Auto[5];

		autos[1] = new Auto(0.07, 35, 6, 0.001, "Gruen");
		autos[2] = new Auto(0.05, 30, 6, 0.001, "Rot");
		autos[3] = new Auto(0.12, 60, 6, 0.001, "Blau");
		autos[4] = new Auto(0.08, 40, 6, 0.001, "Gelb");
		autos[0] = new Auto(0.09, 45, 6, 0.001, "Schwarz");

		Person peins = new Person(1950, "Horst", "Himmel");
		Person pzwei = new Person(1980, "Thorsten", "Schuhmacher");
		Person pdrei = new Person(1999, "Kevin", "Grosskotz");
		Person pvier = new Person(1970, "Beate", "Achso");

		int z = 1;
		autos[1].setFahrer(peins);
		autos[2].setFahrer(pzwei);
		autos[3].setFahrer(pdrei);
		autos[4].setFahrer(pvier);

		for (int x = 1; x < 101; x++) {
			wechsleFahrer(autos);

			for (int y = 1; y < 11; y++) {

				System.out.println("Rennminute: " + (z));
				autos[1].entscheidung();
				autos[2].entscheidung();
				autos[3].entscheidung();
				autos[4].entscheidung();
				autos[0].entscheidung();
				System.out.println("");
				z++;
			}
		}
		System.out.println("");
		System.out.println("Das Endergebnis ist:");
		for (Auto each : autos) {
			System.out.println(each.Wagenname + " ist insgesamt " + each.kilometerstand + "km gefahren.");
		}
	}

	public static void wechsleFahrer(Auto[] autos) {
		Auto leeresAuto = null;
		Auto besetzteAutos[] = new Auto[autos.length - 1];
		int indexBesetzteAutos = 0;
		for (Auto each : autos) {
			if (each.fahrer == null) {
				leeresAuto = each;
			} else {
				besetzteAutos[indexBesetzteAutos] = each;
				indexBesetzteAutos++;
			}
		}
		int z = Zufall.getZufallInt(0, besetzteAutos.length-1);
		Auto besetztesAuto = besetzteAutos[z];
		leeresAuto.setFahrer(besetztesAuto.fahrer);
		besetztesAuto.fahrer = null;
	}
}
