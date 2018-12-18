package Package.Package2;
import java.util.*; 
import Package.*;

public class Egzemplarz {

	private int id_plyty;
	private filmTitle filmTitle;
	private ArrayList <Rezerwacja> rezerwacje = new ArrayList();

	public List<Rezerwacja> getRezerwacje() {
		// TODO - implement Egzemplarz.getRezerwacje
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param rezerwacje
	 */
        public void setID_plyty(int id){
        this.id_plyty=id;
        }
	public void setRezerwacje(List<Rezerwacja> rezerwacje) {
		// TODO - implement Egzemplarz.setRezerwacje
		throw new UnsupportedOperationException();
	}
        
        public void setFilmTitle(filmTitle filmtitle){
            this.filmTitle = filmtitle;
        }



}