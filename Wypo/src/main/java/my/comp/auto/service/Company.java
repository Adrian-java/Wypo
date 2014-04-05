package my.comp.auto.service;

import java.util.List;

import my.comp.auto.domain.Pracownik;
import my.comp.auto.domain.Punkt;

public interface Company {

	public void addPracownik(Pracownik pracownik);
	
	public void deletePracownik(int idPracownik);
	
	public List<Pracownik> allPracownik();
	
	public Pracownik showPracownik(int idPracownik);
	
	
	
	public void addPunkt(Punkt punkt);
	
	public void deletePunkt(int idPunkt);
	
	public List<Punkt> allPunkt();
	
	public Punkt showPunkt(int idPunkt);
	
}
