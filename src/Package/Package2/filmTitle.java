package Package.Package2;

import java.util.*;


public class filmTitle {

	private String tytul;
	private int rok;
        private int ID_plyty;
	private String rezyser;
	private String gatunek;
	private List <Egzemplarz> film;

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
            return film;
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
        
        public filmTitle findFilmTitle(filmTitle filmtitle){
            int idx;
            if((idx = film.indexOf(film)) != -1){
                film=films.get(idx);
                return filmtitle;
            }
            return null;
        }
        

}