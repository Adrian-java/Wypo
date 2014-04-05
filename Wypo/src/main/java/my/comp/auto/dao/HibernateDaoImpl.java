package my.comp.auto.dao;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import my.comp.auto.domain.Akcja;
import my.comp.auto.domain.Klient;
import my.comp.auto.domain.MarkaWyposazenie;
import my.comp.auto.domain.Pracownik;
import my.comp.auto.domain.Punkt;
import my.comp.auto.domain.Samochod;

public class HibernateDaoImpl  implements HibernateDao {

	private HibernateTemplate hibTemplate;
	
	
	
	public void setHibTemplate(HibernateTemplate hibTemplate) {
		this.hibTemplate = hibTemplate;
	}

	@Override
	public void addCar(Samochod samochod, MarkaWyposazenie mw) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addPunkt(Punkt punkt) {
		// TODO Auto-generated method stub
		hibTemplate.save(punkt);
	}

	@Override
	public void addPracownik(Pracownik pracownik) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addKlient(Klient klient) {
		// TODO Auto-generated method stub
		hibTemplate.save(klient);

	}

	@Override
	public void addAction(Akcja akcja) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Klient> getAllKlient() {
		// TODO Auto-generated method stub
		return hibTemplate.loadAll(Klient.class);
	}

	@Override
	public List<Samochod> getAllCars() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Samochod> getFreeCars() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Pracownik> getAllPracownik() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Klient findKlientByPesel(String pesel) {
		// TODO Auto-generated method stub
	
		return (Klient)hibTemplate.get(Klient.class, pesel);
	}

	@Override
	public Samochod findSamochodByVin(String vin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List getQuery(String query) {
		// TODO Auto-generated method stub
		return hibTemplate.find(query);
	}

}
