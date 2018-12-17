package Package;
import java.util.*;
import Package.Package2.*;

public class Facade {

	 List <filmTitle> filmTitles;
	 List <Uzytkownik> uzytkownicy;

	/**
	 * 
	 * @param tytul
	 * @param rok
	 * @param rezyser
	 * @param gatunek
	 * @param id_plyty
	 */
         public boolean logowanie(String login, String haslo){
             Uzytkownik uz_pomoc = new Uzytkownik();
             boolean correct = false;
             uz_pomoc.setHaslo(haslo);
             uz_pomoc.setHaslo(haslo);
             Iterator<Uzytkownik> uz=uzytkownicy.iterator();
             
		while (uz.hasNext()) {
                   Uzytkownik uzz = uz.next();
                   correct = uz_pomoc.porownaj(uzz, uz_pomoc);
                 }
             return correct;
         }
         
	public String addFilmTitle(String data[]) {
		
                Factory factory = new Factory();
                filmTitle newfilmtitle = factory.createFilmTitle(data);
                filmTitle result = szukajFilmu(newfilmtitle);
                if(result == null){
                    filmTitles.add(newfilmtitle);
                    String info = newfilmtitle.toString();
                    return info;
                }
		return null;
                //throw new UnsupportedOperationException();
	}
        
	/**
	 * 
	 * @param dane
	 */
	public void addUzytkownik(Uzytkownik[] dane) {
		// TODO - implement Facade.addUzytkownik
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param dane
	 */
	public void addRezerwacja(Rezerwacja[] dane) {
                
		Rezerwacja rezerwacja = new Rezerwacja();
	}

	/**
	 * 
	 * @param dane
	 */
	public Uzytkownik szukajUzytkownika(String dane) {
		// TODO - implement Facade.szukajUzytkownika
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param dane
	 */
	public void editFilm(filmTitle dane) {
		// TODO - implement Facade.editFilm
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param dane
	 */
	public filmTitle szukajFilmu(filmTitle filmtitle) {
		// TODO - implement Facade.szukajFilmu
                int idx;
                if((idx = filmTitles.indexOf(filmtitle)) != -1){
                    filmtitle = filmTitles.get(idx);
                    return filmtitle;
                }
                return null;
	}
        
        
        
        public void zwrot(int id){
        
        
        throw new UnsupportedOperationException();
        }
        

}