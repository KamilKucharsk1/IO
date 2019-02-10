package Package;
import Package.Package2.*;
import java.util.Date;

public class Factory {

	/**
	 * 
	 * @param data
	 */
	

	/**
	 * 
	 * @param data
	 */
	public Egzemplarz createEgzemplarz(String[] data) {
		Egzemplarz egzemplarz=null;
                
        switch (Integer.parseInt(data[0]))
        {
                case 0:
                     egzemplarz = new Egzemplarz(); //Book object for persisting
                     egzemplarz.setID_plyty(Integer.parseInt(data[1]));
                    break;
        }
        return egzemplarz;
	}

	/**
	 * 
	 * @param dane
	 */
	public Uzytkownik createUzytkownik(String data[]) {
                
            Uzytkownik uzytkownik = null;
            
            uzytkownik = new Uzytkownik();
            uzytkownik.setID(data[0]);
            uzytkownik.setLogin(data[1]);
            uzytkownik.setHaslo(data[2]);
            /*switch (Integer.parseInt(data[0]))
            {
                case 0:
                    uzytkownik = new Uzytkownik();
                    uzytkownik.setID(data[1]);
                    break;
                case 1:
                    uzytkownik = new Uzytkownik();
                    uzytkownik.setLogin(data[1]);
                    uzytkownik.setHaslo(data[2]);
                    
                    break;
            }*/
            return uzytkownik; 
	}

	/**
	 * 
	 * @param number
	 * @param date
	 */
	
        public Rezerwacja createRezerwacja(Uzytkownik uzyt, Egzemplarz egz, Date data, int numer) {
		
            Rezerwacja rezerwacja = new Rezerwacja();
            rezerwacja.setUzytkownik(uzyt);
            rezerwacja.setEgzemplarz(egz);
            rezerwacja.setNumer_rezerwacji(numer);          
            return rezerwacja;
            
	}
        public filmTitle createFilmTitle(String data[]){
            
            filmTitle filmtitle = null;
            switch (Integer.parseInt(data[0]))
            {
                case 0:
                    filmtitle = new filmTitle();
                    filmtitle.setID_filmu(data[1]);
                    filmtitle.setTytul(data[2]);
                    break;
                case 1:
                    filmtitle = new filmTitle();
                    filmtitle.setID_filmu(data[1]);
                    filmtitle.setTytul(data[2]);
                    filmtitle.setRezyser(data[3]);
                    filmtitle.setRok(Integer.parseInt(data[4]));
                    filmtitle.setGatunek(data[5]);
                    break;
            }
            return filmtitle;
        }



/*
public static void main(String t[]){


 
    Facade ap = new Facade();
    String t1[] = {"1","Title1","Rezyser1","1999","Dramat"};
    String t2[] = {"1","Title2","Rezyser2","2015","Komedia"};
    String t3[] = {"1","Title3","Rezyser3","2008","Biograficzny"};

    ap.addFilmTitle(t1);
    ap.addFilmTitle(t2);
    ap.addFilmTitle(t3);
    
    String lan = ap.getFilmTitles().toString();
    System.out.println(lan);
    
    
    String d1[] = {"0", "1"};
    String d2[] = {"0", "2"};
    String d3[] = {"0", "5"};
    String tr1[] = {"0", "1"};
    String tr2[] = {"0", "2"};
    
    ArrayList<String> pom = ap.addFilm(d1, tr1);
    if(pom != null){
        System.out.print(pom);}
    pom = ap.addFilm(d2, tr1);
    if(pom != null){
        System.out.print(pom);}
    pom = ap.addFilm(d2, tr1);
    if(pom != null){
        System.out.print(pom);}
    pom = ap.addFilm(d2, tr2);
    if(pom != null){
        System.out.print(pom);}
    pom = ap.addFilm(d3, tr2);
    if(pom != null){
        System.out.print(pom);}
    System.out.println();
    }*/



}
