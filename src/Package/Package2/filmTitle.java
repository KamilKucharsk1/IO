package Package.Package2;

import java.util.*;
import Package.Factory;

public class filmTitle {

    private String tytul;
    private int rok;
    private String ID_filmu;
    private String rezyser;
    private String gatunek;
    private List<Egzemplarz> films = new ArrayList();

    public String getTytul() {
        return this.tytul;
    }
    public filmTitle(){}
    
    public filmTitle(String dane[]){
        this.ID_filmu = dane[1];
        this.tytul= dane [2];
    }
    
    /**
     *
     * @param tytul
     */
    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public int getRok() {
        return this.rok;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final filmTitle other = (filmTitle) obj;
        if (!Objects.equals(this.tytul, other.tytul)) {
            return false;
        }
        if (!Objects.equals(this.ID_filmu, other.ID_filmu)) {
            return false;
        }
        return true;
    }

    public List<Egzemplarz> getFilms() {
        return films;
    }

    /**
     *
     * @param rok
     */
    public void setRok(int rok) {
        this.rok = rok;
    }

    public String getRezyser() {
        return this.rezyser;
    }

    /**
     *
     * @param rezyser
     */
    public void setRezyser(String rezyser) {
        this.rezyser = rezyser;
    }

    public String getGatunek() {
        return this.gatunek;
    }

    public String getID_filmu() {
        return ID_filmu;
    }

    public void setID_filmu(String ID_filmu) {
        this.ID_filmu = ID_filmu;
    }

    /**
     *
     * @param gatunek
     */
    public void setGatunek(String gatunek) {
        this.gatunek = gatunek;
    }

    public Egzemplarz findFilm(Egzemplarz film) {
        int idx=-1;

        if ((idx = films.indexOf(film)) != -1) {
            film = films.get(idx);
            return film;
        }

        return null;
    }

    @Override
    public String toString() {
        String filmtitledata = "\nTitle: " + getTytul();
            return filmtitledata;
    }

    public ArrayList<String> getDataOfFilms() {
       
        ArrayList<String> dataoffilms = new ArrayList<>();
        Iterator<Egzemplarz> filmiterator = films.iterator();
        
        while (filmiterator.hasNext()) {
            
            Egzemplarz nextfilm = filmiterator.next();
            dataoffilms.add(nextfilm.toString());
        }
        return dataoffilms;
    }

    public ArrayList<String> addFilm(String data[]) {
        
        Factory factory = new Factory();
        
        Egzemplarz newfilm = factory.createEgzemplarz(data);
       
        if (findFilm(newfilm) == null) {
           
            films.add(newfilm);
            newfilm.setFilmTitle(this);
            
            return getDataOfFilms();
            
            
        }
        return null;
    }

    public boolean addRezerwacja(Uzytkownik uzytk, String dane[]) {
        GregorianCalendar data = new GregorianCalendar(Integer.parseInt(dane[0]), Integer.parseInt(dane[1]), Integer.parseInt(dane[2]));
        Date date = data.getGregorianChange();
        
        for (Egzemplarz egz : films) {
            if (egz.wolny(date)) {
                
                egz.zarezerwuj(uzytk, date);
                return true;
            }

        }
        return false;
    }
}
