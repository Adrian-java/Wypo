package my.comp.auto.service;

import java.util.Date;

public interface Reserve {

	
	public boolean reserveCar(String pesel, Date planowanaZakonczenia, String miejscowosc, int idPracownika, String vin );
	
	//wyb�r samochodu na podstawie: dany nr vin kt�ry nie jest zwr�cony: faktyczna data oddania jest nullem
	public boolean returnCar(String vin, String miejscowosc, Date FaktycznaZakonczenia, int idPracownika);
}
