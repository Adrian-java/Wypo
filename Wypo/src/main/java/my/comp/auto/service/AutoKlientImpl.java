package my.comp.auto.service;

import java.util.List;

import my.comp.auto.dao.HibernateDao;
import my.comp.auto.domain.Klient;

public class AutoKlientImpl implements AutoKlient {

	HibernateDao hibernateDao;
	
	
	public void setHibernateDao(HibernateDao hibernateDao) {
		this.hibernateDao = hibernateDao;
	}

	@Override
	public boolean isKlient(String pesel) {
		// TODO Auto-generated method stub
		int count;
		count = hibernateDao.getQuery("from Klient where pesel = "+pesel).size();
		if(count==0)
			return false;
		else
			return true;
	}

	@Override
	public boolean isFree(String pesel) {
		// TODO Auto-generated method stub
		int count;
		count = hibernateDao.getQuery("from Klient where stan = 0 and pesel="+pesel).size();
		if(count==1)
			return false;
		else
			return true;
	}

	@Override
	public void addKlient(Klient klient) {
		hibernateDao.addKlient(klient);

	}

	@Override
	public void deleteKlient(Klient klient) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateKlient(Klient klient) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Klient> klientLenders() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Klient> klientNotLenders() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Klient> allKlient() {
		// TODO Auto-generated method stub
		return hibernateDao.getAllKlient();
	}

	@Override
	public List getQuery(String query) {
		// TODO Auto-generated method stub
		return hibernateDao.getQuery(query);
	}

}
