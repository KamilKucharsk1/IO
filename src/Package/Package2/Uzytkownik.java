package Package.Package2;
import java.util.*;

public class Uzytkownik {

	private String login;
	private String haslo;
	private List wypozyczenia;

	public String getLogin() {
		return this.login;
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

	public void getWypozyczenia() {
		// TODO - implement Uzytkownik.getWypozyczenia
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param wypozyczenia
	 */
	public void setWypozyczenia(int wypozyczenia) {
		// TODO - implement Uzytkownik.setWypozyczenia
		throw new UnsupportedOperationException();
	}

}