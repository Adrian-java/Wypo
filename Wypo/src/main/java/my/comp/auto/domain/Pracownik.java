package my.comp.auto.domain;




public class Pracownik {

	private int idPracownik;
	private String imie;
	private String nazwisko;
	private Punkt idPunkt;
	
	public int getIdPracownik() {
		return idPracownik;
	}
	public void setIdPracownik(int idPracownik) {
		this.idPracownik = idPracownik;
	}
	public String getImie() {
		return imie;
	}
	public void setImie(String imie) {
		this.imie = imie;
	}
	public String getNazwisko() {
		return nazwisko;
	}
	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}
	public Punkt getIdPunkt() {
		return idPunkt;
	}
	public void setIdPunkt(Punkt idPunkt) {
		this.idPunkt = idPunkt;
	}
	
	
}
