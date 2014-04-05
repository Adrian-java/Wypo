package my.comp.auto.domain;

import java.sql.Date;

public class Akcja {
	
	private int idAkcja;
	private Date dataRozpoczecia;
	private Date planowanaDataZakonczenia;
	private Date faktycznaDataZakonczenia;
	private String status;
	private String idKlient;
	private int idPunktWypozyczenia;
	private int idPracownikaWypozyczajacego;
	private String idSamochod;
	private int idPlatnosc;
	private int idPunktPrzyjecia;
	private int idPracownikaPrzyjmujacego;
	
	public int getIdAkcja() {
		return idAkcja;
	}
	public void setIdAkcja(int idAkcja) {
		this.idAkcja = idAkcja;
	}
	public Date getDataRozpoczecia() {
		return dataRozpoczecia;
	}
	public void setDataRozpoczecia(Date dataRozpoczecia) {
		this.dataRozpoczecia = dataRozpoczecia;
	}
	public Date getPlanowanaDataZakonczenia() {
		return planowanaDataZakonczenia;
	}
	public void setPlanowanaDataZakonczenia(Date planowanaDataZakonczenia) {
		this.planowanaDataZakonczenia = planowanaDataZakonczenia;
	}
	public Date getFaktycznaDataZakonczenia() {
		return faktycznaDataZakonczenia;
	}
	public void setFaktycznaDataZakonczenia(Date faktycznaDataZakonczenia) {
		this.faktycznaDataZakonczenia = faktycznaDataZakonczenia;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getIdKlient() {
		return idKlient;
	}
	public void setIdKlient(String idKlient) {
		this.idKlient = idKlient;
	}
	public int getIdPunktWypozyczenia() {
		return idPunktWypozyczenia;
	}
	public void setIdPunktWypozyczenia(int idPunktWypozyczenia) {
		this.idPunktWypozyczenia = idPunktWypozyczenia;
	}
	public int getIdPracownikaWypozyczajacego() {
		return idPracownikaWypozyczajacego;
	}
	public void setIdPracownikaWypozyczajacego(int idPracownikaWypozyczajacego) {
		this.idPracownikaWypozyczajacego = idPracownikaWypozyczajacego;
	}
	public String getIdSamochod() {
		return idSamochod;
	}
	public void setIdSamochod(String idSamochod) {
		this.idSamochod = idSamochod;
	}
	public int getIdPlatnosc() {
		return idPlatnosc;
	}
	public void setIdPlatnosc(int idPlatnosc) {
		this.idPlatnosc = idPlatnosc;
	}
	public int getIdPunktPrzyjecia() {
		return idPunktPrzyjecia;
	}
	public void setIdPunktPrzyjecia(int idPunktPrzyjecia) {
		this.idPunktPrzyjecia = idPunktPrzyjecia;
	}
	public int getIdPracownikaPrzyjmujacego() {
		return idPracownikaPrzyjmujacego;
	}
	public void setIdPracownikaPrzyjmujacego(int idPracownikaPrzyjmujacego) {
		this.idPracownikaPrzyjmujacego = idPracownikaPrzyjmujacego;
	}
	
	
}
