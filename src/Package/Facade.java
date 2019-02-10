package Package;
//import Package.Package2.Rezerwacja;

import Package.Package2.Rezerwacja;
import Package.Package2.Uzytkownik;
import Package.Package2.filmTitle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;




public class Facade {

    List<filmTitle> filmTitles;
    List<Uzytkownik> uzytkownicy;
    List<Rezerwacja> rezerwacje;
    //    List <Egzemplarz> egzemplarze;

    public Facade() {
        filmTitles = new ArrayList<>();
        uzytkownicy = new ArrayList<>();
        rezerwacje = new ArrayList<>();

    }

    /**
     *
     * @param tytul
     * @param rok
     * @param rezyser
     * @param gatunek
     * @param id_plyty
     */
    public boolean logowanie(String login, String haslo) {
        Uzytkownik uz_pomoc = new Uzytkownik();
        boolean correct = false;
        uz_pomoc.setHaslo(haslo);
        uz_pomoc.setHaslo(haslo);
        Iterator<Uzytkownik> uz = uzytkownicy.iterator();

        while (uz.hasNext()) {
            Uzytkownik uzz = uz.next();
            correct = uz_pomoc.porownaj(uzz, uz_pomoc);
        }
        return correct;
    }

    void setFilmTitles(List<filmTitle> filmtitles) {
        filmTitles = filmtitles;
    }

    public filmTitle szukajFilmu(filmTitle filmtitle) {
        // TODO - implement Facade.szukajFilmu
        int idx;
        if ((idx = filmTitles.indexOf(filmtitle)) != -1) {
            filmtitle = filmTitles.get(idx);
            return filmtitle;
        }
        return null;
    }

    public String addFilmTitle(String data[]) {

        Factory factory = new Factory();

        filmTitle newfilmtitle = factory.createFilmTitle(data);

        filmTitle result = szukajFilmu(newfilmtitle);

        if (result == null) {
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
    public String addUzytkownik(String dane[]) {

        Factory factory = new Factory();

        Uzytkownik uzytkownik = factory.createUzytkownik(dane);

        Uzytkownik result = szukajUzytkownika(uzytkownik);

        if (result == null) {
            uzytkownicy.add(uzytkownik);
            String info = uzytkownik.toString();
            return info;
        }
        return null;

    }

    /**
     *
     * @param uzytkownik
     * @param film
     * @param dane
     * @return 
     */
    public boolean addRezerwacja(String uzytkownik[], String film[],String dane[]) {

        Factory factory = new Factory();
        Uzytkownik uzyt = factory.createUzytkownik(uzytkownik);

        Uzytkownik uzytk = szukajUzytkownika(uzyt);
        if(uzytk==null)
            return false;
        filmTitle filmtitle = factory.createFilmTitle(film);

        filmTitle result = szukajFilmu(filmtitle);
        if(result==null)
             return false;
        return result.addRezerwacja(uzytk, dane);

    /*    Rezerwacja rezerwacja = factory.createRezerwacja(dane);
        if (wynik == null) {
            // throw exception
            System.out.println("Uzytkownik nie istnieje");
        } else {
            wynik.setWypozyczenia(rezerwacja);
            rezerwacje.add(rezerwacja);

        }*/

    }

    /*
        public ArrayList<String> addFilm(String data[]) {
        Factory factory = new Factory();
        Egzemplarz newfilm;
        newfilm = factory.createEgzemplarz(data);
        if (findFilm(newfilm) == null) {
                            System.out.println("s2: brak filmu" );
            films.add(newfilm);
            newfilm.setFilmTitle(this);
            return getDataOfFilms();
        }
        return null;
    }
     */
    /**
     *
     * @param dane
     */
    public Uzytkownik szukajUzytkownika(Uzytkownik uzytkownik) {

        int idx;
        if ((idx = uzytkownicy.indexOf(uzytkownik)) != -1) {
            uzytkownik = uzytkownicy.get(idx);
            return uzytkownik;
        }
        return null;
    }

    /*
   
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
    public filmTitle findFilmTitle(filmTitle filmtitle) {
        int idx;
        if ((idx = filmTitles.indexOf(filmtitle)) != -1) {
            
            filmtitle = filmTitles.get(idx);
            
            
            return filmtitle;
        }
        return null;
    }

    public ArrayList<String> addFilm(String data1[], String data2[]) {
        filmTitle filmtitleexist, searchpattern;
        Factory fabryka = new Factory();
        searchpattern = fabryka.createFilmTitle(data1);
        if ((filmtitleexist = findFilmTitle(searchpattern)) != null) {

            return filmtitleexist.addFilm(data2);
        }
        return null;
    }

    /*
        public ArrayList<String> addUzytkownik(String data1, String data2){
            
            Uzytkownik uz = new Uzytkownik();
            Factory fabryka = new Factory();
            
            uz.setLogin(data1);
            uz.setHaslo(data2);
            
            System.out.println("u1: "+uz);
            
            return null;
        }
     */
    public List<filmTitle> getFilmTitles() {
        return filmTitles;
    }

    public List<Uzytkownik> getUzytkownicy() {
        return uzytkownicy;
    }

    public List<Rezerwacja> getRezerwacje() {
        return rezerwacje;
    }

    public void zwrot(int id) {

        throw new UnsupportedOperationException();
    }

    /*
        public void utworzRezerwacje(int nr){
            Rezerwacja rezerwacja = new Rezerwacja(nr);
        }
     */
    public static void main(String t[]) {

//--------------------------------------------TYTULY_FILMOW-------------------
        Facade ap = new Facade();
        String t1[] = {"0", "1", "Avatar"};
        String t2[] = {"0", "2", "film2"};


        ap.addFilmTitle(t2);
        ap.addFilmTitle(t1);


        String lan = ap.getFilmTitles().toString();
        System.out.println(lan);

//--------------------------------------------EGZEMPLARZE---------------------
       
        String tr1[] = {"0", "1"};
        String tr2[] = {"0", "2"};
        ArrayList<String> pom;
        pom = ap.addFilm(t1, tr1);
      
        System.out.println(pom.toString());

        //-----------------------------------------UZYTKOWNICY---------------------
        String u1[] = {"1", "Paweł Nowak", "haslo123"};
        String u2[] = {"2", "Kowalski", "fdsafd"};
        String u3[] = {"3", "Jan Kowalski", "haslo1"};

        // id nie działa poprawnie nie jest unique
        ap.addUzytkownik(u1);
        ap.addUzytkownik(u2);
        ap.addUzytkownik(u3);

        String lan1 = ap.getUzytkownicy().toString();
        System.out.println(lan1);

        //----------------------------------------REZERWACJE-----------------------
        String data1[]={"2018","12","15" };
        String film[] = {"0","1", "Avatar"};
        
        ap.addRezerwacja(u1, film, data1);
        
        


    }

}
