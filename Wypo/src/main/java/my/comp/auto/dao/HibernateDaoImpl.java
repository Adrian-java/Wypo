package my.comp.auto.dao;

import java.util.List;

import org.hibernate.exception.DataException;
import org.springframework.orm.hibernate3.HibernateTemplate;

import my.comp.auto.domain.Akcja;
import my.comp.auto.domain.Klient;
import my.comp.auto.domain.MarkaWyposazenie;
import my.comp.auto.domain.Pracownik;
import my.comp.auto.domain.Punkt;
import my.comp.auto.domain.Samochod;

public class HibernateDaoImpl  implements HibernateDao {

	private HibernateTemplate hibTemplate;
	
	
	//wstrzykiwanie zaleznosci
	public void setHibTemplate(HibernateTemplate hibTemplate) {
		this.hibTemplate = hibTemplate;
	}

	@Override
	public void addCar(Samochod samochod, MarkaWyposazenie mw) throws DataException {
		hibTemplate.save(samochod);
		hibTemplate.save(mw);
		
	}

	@Override
	public void addPunkt(Punkt punkt) throws DataException {
		// TODO Auto-generated method stub
		hibTemplate.save(punkt);
	}

	@Override
	public void addPracownik(Pracownik pracownik) throws DataException {
		hibTemplate.save(pracownik);
		
	}

	@Override
	public void addKlient(Klient klient) throws DataException {
		// TODO Auto-generated method stub
		hibTemplate.save(klient);

	}

	@Override
	public void addAction(Akcja akcja) throws DataException {
		// TODO Auto-generated method stub
		hibTemplate.save(akcja);
		
	}

	@Override
	public List<Klient> getAllKlient() throws DataException {
		// TODO Auto-generated method stub
		return hibTemplate.loadAll(Klient.class);
	}

	@Override
	public List<Samochod> getAllCars() throws DataException {
		// TODO Auto-generated method stub
		return hibTemplate.loadAll(Samochod.class);
	}

	@Override
	public List<Samochod> getFreeCars() throws DataException {
		// TODO Auto-generated method stub
		return hibTemplate.find("from Samochod where dostepny = 1");
	}

	@Override
	public List<Pracownik> getAllPracownik() throws DataException {
		// TODO Auto-generated method stub
		return hibTemplate.loadAll(Pracownik.class);
	}

	@Override
	public Klient findKlientByPesel(String pesel) throws DataException {
		// TODO Auto-generated method stub
	
		return (Klient)hibTemplate.get(Klient.class, pesel);
	}

	@Override
	public Samochod findSamochodByVin(String vin) throws DataException {
		// TODO Auto-generated method stub
		return hibTemplate.get(Samochod.class, vin);
	}

	@Override
	public List getQuery(String query) throws DataException {
		// TODO Auto-generated method stub
		return hibTemplate.find(query);
	}

}
