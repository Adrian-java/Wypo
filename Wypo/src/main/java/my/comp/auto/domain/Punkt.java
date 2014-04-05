package my.comp.auto.domain;

import java.util.Set;



public class Punkt {

	
	private int idPunkt;
	private String miejscowosc;
	private Set<Pracownik> pracownik;
	
	public int getIdPunkt() {
		return idPunkt;
	}
	public void setIdPunkt(int idPunkt) {
		this.idPunkt = idPunkt;
	}
	public String getMiejscowosc() {
		return miejscowosc;
	}
	public void setMiejscowosc(String miejscowosc) {
		this.miejscowosc = miejscowosc;
	}
	public Set<Pracownik> getPracownik() {
		return pracownik;
	}
	public void setPracownik(Set<Pracownik> pracownik) {
		this.pracownik = pracownik;
	}
	
	
}
