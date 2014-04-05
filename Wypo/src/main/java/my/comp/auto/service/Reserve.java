package my.comp.auto.service;

import java.util.Date;

public interface Reserve {

	
	public boolean reserveCar(String pesel, Date planowanaZakonczenia, String miejscowosc, int idPracownika, String vin );
	
	//wybór samochodu na podstawie: dany nr vin który nie jest zwrócony: faktyczna data oddania jest nullem
	public boolean returnCar(String vin, String miejscowosc, Date FaktycznaZakonczenia, int idPracownika);
}
