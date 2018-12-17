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
                    filmtitle.setTytul(data[2]);
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
    ap.addFilmTitle(t1);


}
}