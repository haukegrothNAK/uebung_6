
public class AutoTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Auto testwagen1=new Auto(0.1, 50, 7, 0.01, "Auto1");
Auto testwagen2=new Auto(0.06, 30, 4, 0.005, "Auto2");

Person testperson1=new Person(1955,"Horst","Schröder");
Person testperson2=new Person(1999,"Kevin","Müller");

System.out.println("Die "+testperson1+" heisst "+testperson1.Vorname+" "+testperson1.Nachname+" und ist "+testperson1.Alter+" Jahre alt.");
System.out.println("Die "+testperson2+" heisst "+testperson2.Vorname+" "+testperson2.Nachname+" und ist "+testperson2.Alter+" Jahre alt.");

for(int x=0;x<3;x++) {
	
	testwagen1.fahre(Zufall.getZufallInt(1, 500));
	System.out.println("Das "+testwagen1+" hat einen Kilometerstand von "+(testwagen1.kilometerstand)+"km und einen Tankinhalt von "+(testwagen1.tankinhalt)+"L."+testwagen1.ProfiltiefeReifen);
//	System.out.println("");
	testwagen2.fahre(Zufall.getZufallInt(1, 500));
	System.out.println("Das "+testwagen2+" hat einen Kilometerstand von "+(testwagen2.kilometerstand)+"km und einen Tankinhalt von "+(testwagen2.tankinhalt)+"L."+testwagen2.ProfiltiefeReifen);
	System.out.println("");
//	System.out.println("");
	}
}

}
