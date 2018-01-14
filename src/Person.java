
public class Person {

	public int Geburtsjahr;
	public String Vorname;
	public String Nachname;
	public int Alter;
	public int Kalenderjahr = 2018;
	
	public Person(int jahr, String vorn, String nachn) {
		Geburtsjahr=jahr;
		Vorname=vorn;
		Nachname=nachn;
		Alter=Kalenderjahr-jahr;
	}
	
}
