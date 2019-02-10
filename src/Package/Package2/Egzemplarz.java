package Package.Package2;
import Package.Factory;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class Egzemplarz {
        static int numer;
	private int id_plyty;
	private filmTitle filmTitle;
	private ArrayList <Rezerwacja> rezerwacje = new ArrayList();

	public List<Rezerwacja> getRezerwacje() {
		return rezerwacje;
	}
        public Egzemplarz(){}
        public Egzemplarz(String[] a){
        this.id_plyty = Integer.parseInt(a[1]);
        }
	/**
	 * 
	 * @param rezerwacje
	 */
        public void setID_plyty(int id){
        this.id_plyty=id;
        }
	public void setRezerwacje(List<Rezerwacja> rezerwacje) {
		
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
        final Egzemplarz other = (Egzemplarz) obj;
        if (this.id_plyty != other.id_plyty) {
            return false;
        }
        return true;
    }
        
        public void setFilmTitle(filmTitle filmtitle){
            this.filmTitle = filmtitle;
        }

        public boolean wolny (Date date){
            for (Rezerwacja rez : rezerwacje){
            if(rez.sprawdzdate(date))
                return false;
            }          
            return true;
        }
        public void zarezerwuj(Uzytkownik uzytk,Date date){
            
            Factory factory = new Factory();
            
            Rezerwacja rez = factory.createRezerwacja(uzytk,this,date,numer++);
            
            rezerwacje.add(rez);
            uzytk.dodajrezerwacje(rez);            
        }

    @Override
    public String toString() {
        return  "id_plyty=" + id_plyty;
    }


}