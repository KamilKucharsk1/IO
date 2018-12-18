package Package;
import java.time.LocalDate;
import Package.Package2.*;
import java.util.List;
import java.util.ArrayList;
import Package.Facade;

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
		Egzemplarz egzemplarz = null;
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
	public Uzytkownik createUzytkownik(String[] dane) {
		// TODO - implement Factory.createUzytkownik
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param number
	 * @param date
	 */
	public Rezerwacja createRezerwacja(int number, LocalDate date) {
		// TODO - implement Factory.createRezerwacja
		throw new UnsupportedOperationException();
	}
        
        public filmTitle createFilmTitle(String data[]){
            filmTitle filmtitle = null;
            switch (Integer.parseInt(data[0]))
            {
                case 0:
                    filmtitle = new filmTitle();
                    //filmtitle.setID_plyty(data[1]);
                    break;
                case 1:
                    filmtitle = new filmTitle();
                    filmtitle.setTytul(data[1]);
                    filmtitle.setRezyser(data[2]);
                    filmtitle.setRok(Integer.parseInt(data[3]));
                    filmtitle.setGatunek(data[4]);
                    break;
            }
            return filmtitle;
        }




public static void main(String t[]){

    System.out.println("EEEEooo");
    



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
    }



}
