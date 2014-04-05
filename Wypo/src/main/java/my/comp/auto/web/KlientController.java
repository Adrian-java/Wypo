package my.comp.auto.web;

import java.util.Map;

import my.comp.auto.dao.HibernateDao;
import my.comp.auto.domain.Klient;
import my.comp.auto.domain.Pracownik;
import my.comp.auto.service.AutoKlientImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class KlientController {
	@Autowired
	private AutoKlientImpl klientdao;
	
	@RequestMapping("/index")
	public String setupForm(Map<String, Object> map){
		Klient klient = new Klient();
		map.put("klient", klient);
		map.put("klientP", klientdao.getQuery("from Klient k where k.stan = 1"));
		return "klient";
	}
	
	@RequestMapping("/pracownik")
	public String setupFormy(Map<String, Object> map){
		Pracownik pracownik = new Pracownik();;
		map.put("pracownik", pracownik);
		map.put("pracownikP", klientdao.getQuery("from pracownik "));
		return "pracownik";
	}
	
	/*@RequestMapping(value="/klient.do", method=RequestMethod.POST)
	public String doActions(@ModelAttribute Klient klient, BindingResult result, @RequestParam String action, Map<String, Object> map){
		Klient klientResult = new Klient();
		
		//only in Java7 you can put String in switch
		if(action.toLowerCase() == "add"){
			klientdao.addKlient(klient);
		}
		if(action.toLowerCase() =="edit"){
			
		}
		if(action.toLowerCase() =="delete"){
			
		}
		if(action.toLowerCase() =="search"){
			
		}
		
		map.put("klient", klientResult);
		map.put("klientP", klientdao.allKlient());
		return "klient";
	}*/
}
