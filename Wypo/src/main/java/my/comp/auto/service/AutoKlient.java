package my.comp.auto.service;

import java.util.List;

import my.comp.auto.domain.Klient;

public interface AutoKlient {

	
	public boolean isKlient(String pesel);
	
	public boolean isFree(String pesel);
	
	public void addKlient(Klient klient);
	
	public void deleteKlient(Klient klient);
	
	public void updateKlient(Klient klient);
	
	public List<Klient> klientLenders();
	
	public List<Klient> klientNotLenders();
	
	public List<Klient> allKlient();
	
	
}
