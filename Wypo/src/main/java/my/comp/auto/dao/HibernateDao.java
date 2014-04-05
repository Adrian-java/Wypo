package my.comp.auto.dao;

import java.util.List;

import my.comp.auto.domain.*;

public interface HibernateDao {

	
	/*Dodaje samochod oraz zwiazane z nim wyposazenie*/
	
	public void addCar(Samochod samochod, MarkaWyposazenie mw);
	
	
	/*dodaje Punkt (filie) wypozyczalni*/
	
	public void addPunkt(Punkt punkt);
	
	
	/*Dodaje pracownika*/
	
	public void addPracownik(Pracownik pracownik);
	
	
	/*Dodaje klienta*/
	
	public void addKlient(Klient klient);
	
	
	/*Dodaje akcje czyli rejestruje wypozyczenia*/
	
	public void addAction(Akcja akcja);
	
	
	/*Listuje wszystkich klientow*/
	
	public List<Klient> getAllKlient();
	
	
	/*Listuje wszystkie samochody*/
	
	public List<Samochod> getAllCars();
	
	
	/*Listuje wszystkie wolne samochody*/
	
	public List<Samochod> getFreeCars();
	
	
	/*Listuje wszystkich pracownikow i zwiazane z nimni punkty*/
	
	public List<Pracownik> getAllPracownik();
	
	
	/*Szuka klienta po nr pesel*/
	
	public Klient findKlientByPesel(String pesel);
	
	
	/*Szuka samochodu po nr vin*/
	
	public Samochod findSamochodByVin(String vin);
}
