package my.comp.auto.service;

import java.util.List;

import my.comp.auto.domain.Samochod;

public interface AutoCar {

	
public boolean isCar(String vin);
	
	public void addCar(Samochod samochod);
	
	public void deleteCar(Samochod samochod);
	
	public void updateCar(Samochod samochod);
	
	public List<Samochod> carLender();
	
	public List<Samochod> carNotLender();
	
	public List<Samochod> allSamochod();
}
