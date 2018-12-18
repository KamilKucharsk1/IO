package Package.Package2;

import java.util.*;
import Package.Factory;


public class filmTitle {

	private String tytul;
	private int rok;
        private int ID_plyty;
	private String rezyser;
	private String gatunek;
	private List <Egzemplarz> films;

	public String getTytul() {
		return this.tytul;
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
        
        public List<Egzemplarz> getFilms(){
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
        
        public void setID_plyty(int id){
            this.ID_plyty = id;
        }
        
        public int getID_plyty(){
            return this.ID_plyty;
        }

	/**
	 * 
	 * @param gatunek
	 */
	public void setGatunek(String gatunek) {
		this.gatunek = gatunek;
	}
        
        public Egzemplarz findFilm(Egzemplarz film){
            int idx;
            if((idx = films.indexOf(film)) != -1){
                film = films.get(idx);
                return film;
            }
            return null;
        }
        
        
        
        
        @Override
            public String toString(){
                String filmtitledata = "\nTitle: " + getTytul();
                filmtitledata += " Rezyser: " + getRezyser();
                filmtitledata += " Rok wydania: " + getRok();
                filmtitledata += " Gatunek: " + getGatunek();
                
                return filmtitledata;
            }
            
            
        public ArrayList<String> getDataOfFilms(){
            ArrayList<String> dataoffilms = new ArrayList<>();
            Iterator<Egzemplarz> filmiterator = films.iterator();
            while(filmiterator.hasNext()){
                Egzemplarz nextfilm = filmiterator.next();
                dataoffilms.add(nextfilm.toString());
            }
            return dataoffilms;
        }
            
            
        public ArrayList<String> addFilm(String data[]){
            Factory factory = new Factory();
            Egzemplarz newfilm;
            newfilm = factory.createEgzemplarz(data);
            if(findFilm(newfilm) == null){
                films.add(newfilm);
                newfilm.setFilmTitle(this);
                return getDataOfFilms();
            }
            return null;
        }
        

}