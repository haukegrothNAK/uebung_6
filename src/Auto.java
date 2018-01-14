
public class Auto {
	public double kilometerstand;
	public double tankinhalt = 40;
	public double BenzinverbrauchProKm;
	public double maximalerTankinhalt;
	public double ProfiltiefeReifen;
	final String Wagenname;
	public double Reifenabrieb;
	public  Person fahrer = null;

	public void fahre(double kilometer) {

		double Benzinverbrauch = BenzinverbrauchProKm;
		double Reifenverbrauch = Reifenabrieb;
		if (fahrer == null) {
			System.out.println(this.Wagenname+" hat keinen Fahrer und kann nicht fahren.");
		} else {
			if (fahrer.Alter <= 20) {
				Benzinverbrauch = BenzinverbrauchProKm * 1.2;
				Reifenverbrauch = Reifenabrieb * 1.1;
			}

			if (fahrer.Alter >= 60) {
				Benzinverbrauch = BenzinverbrauchProKm * 0.9;
				Reifenverbrauch = Reifenabrieb * 0.95;
			}

			if (kilometer * Benzinverbrauch > tankinhalt) {
				kilometer = tankinhalt / Benzinverbrauch;
			}

			if (kilometer * Reifenverbrauch > (ProfiltiefeReifen - 3)) {
				kilometer = (ProfiltiefeReifen - 3) / Reifenabrieb;
			}
			kilometerstand = kilometerstand + kilometer;
			tankinhalt = tankinhalt - (kilometer * Benzinverbrauch);
			ProfiltiefeReifen = ProfiltiefeReifen - kilometer * Reifenverbrauch;
			System.out.println(this.Wagenname+" ist "+kilometer+"km gefahren, hat einen Kilometerstand von "+this.kilometerstand+"km, einen Tankinhalt von "+this.tankinhalt+"L und eine Profiltiefe von "+this.ProfiltiefeReifen);
		}
	}
	
	public void tanke(double liter) {
		
			this.tankinhalt=this.maximalerTankinhalt;
		
	}
	
	public Auto(double verbr, double tankgr, double reifenprof, double reifenabr, String name) {
		this.BenzinverbrauchProKm=verbr;
		this.maximalerTankinhalt=tankgr;
		this.ProfiltiefeReifen=reifenprof;
		this.Reifenabrieb=reifenabr;
		this.Wagenname=name;
	}
	
	public void wechsleReifen() {
		this.ProfiltiefeReifen=7;
	}
	
	public void entscheidung() {
		if (this.tankinhalt == 0) {
			this.tanke(maximalerTankinhalt);
			System.out.println(this.Wagenname+" tankt.");
		} else {
			if (this.ProfiltiefeReifen == 3) {
				this.wechsleReifen();
				System.out.println(this.Wagenname+" wechselt die Reifen.");
			} else {
				this.fahre(Zufall.getZufallDouble(3, 4));
//				System.out.println(this.Wagenname+" fährt.");
			}
		}

	}
	public void setFahrer(Person fahrer) {
		this.fahrer = fahrer;
	}
}
