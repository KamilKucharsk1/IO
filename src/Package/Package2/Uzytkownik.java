package Package.Package2;
import java.util.*;
import Package.Factory;

public class Uzytkownik {

	private String login;
	private String haslo;
        private String ID;
	private ArrayList <Rezerwacja> rezerwacje = new ArrayList();

	public String getLogin() {
		return this.login;
	}
        public Uzytkownik(){}
        
        public Uzytkownik(String a[]){
        this.ID = a[0];
        this.login = a[1];
        this.haslo = a[2];
        }
    public String getID() {
        return ID;
    }

    public void setID(String id) {
        this.ID = id;
    }

	/**
	 * 
	 * @param login
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	public String getHaslo() {
		return this.haslo;
	}
        public boolean porownaj(Uzytkownik uz, Uzytkownik uz_pomoc){
        if(uz.getHaslo()==uz_pomoc.getHaslo() && uz.getLogin()==uz_pomoc.getLogin())
            return true;
        else
            return false;
        }
       
	/**
	 * 
	 * @param haslo
	 */
	public void setHaslo(String haslo) {
		this.haslo = haslo;
	}

    public ArrayList<Rezerwacja> getRezerwacje() {
        return rezerwacje;
    }

    public void setRezerwacje(ArrayList<Rezerwacja> rezerwacje) {
        this.rezerwacje = rezerwacje;
    }

	
        
        
        /*
        public ArrayList<String> addUzytkownik(String data1, String data2){
            
            Factory factory = new Factory();
            Uzytkownik newuzytkownik;
            newuzytkownik = factory.createUzytkownik(data1,data2);
            
            return newuzytkownik; 
       }*/

    @Override
    public String toString() {
        
        String uzytkownik = "\nID uzytkownika: " + getID();
        uzytkownik += " Login: " + getLogin();
        uzytkownik += " Haslo: " + getHaslo();
        
        return uzytkownik;
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
    }*/

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.login);
        hash = 79 * hash + Objects.hashCode(this.haslo);
        hash = 79 * hash + Objects.hashCode(this.ID);
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
        final Uzytkownik other = (Uzytkownik) obj;
        if (!Objects.equals(this.login, other.login)) {
            return false;
        }
        if (!Objects.equals(this.haslo, other.haslo)) {
            return false;
        }
        if (!Objects.equals(this.ID, other.ID)) {
            return false;
        }
        return true;
    }
    public void dodajrezerwacje (Rezerwacja rez){
        rezerwacje.add(rez);
    }

}