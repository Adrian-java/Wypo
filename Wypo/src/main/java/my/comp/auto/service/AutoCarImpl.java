package my.comp.auto.service;

import java.util.List;

import my.comp.auto.dao.HibernateDao;
import my.comp.auto.domain.MarkaWyposazenie;
import my.comp.auto.domain.Samochod;

public class AutoCarImpl implements AutoCar {

	HibernateDao hibernateDao;
	
	
	public void setHibernateDao(HibernateDao hibernateDao) {
		this.hibernateDao = hibernateDao;
	}

	@Override
	public boolean isCar(String vin) {
		// TODO Auto-generated method stub
		int count;
		count = hibernateDao.getQuery("from Samochod where vin = "+vin).size();
		if(count==0)
			return false;
		else
			return true;
	}

	@Override
	public void addCar(Samochod samochod) {
		hibernateDao.addCar(samochod, new MarkaWyposazenie());

	}

	@Override
	public void deleteCar(Samochod samochod) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateCar(Samochod samochod) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Samochod> carLender() {
		// TODO Auto-generated method stub
		return hibernateDao.getQuery("form Samochod where dostepny = 0");
	}

	@Override
	public List<Samochod> carNotLender() {
		// TODO Auto-generated method stub
		return hibernateDao.getQuery("form Samochod where dostepny = 1");
	}

	@Override
	public List<Samochod> allSamochod() {
		// TODO Auto-generated method stub
		return hibernateDao.getAllCars();
	}

}
