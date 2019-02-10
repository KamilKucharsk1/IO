package Package.Package2;

import java.util.Date;

public class Rezerwacja {

    private int numer_rezerwacji;
    private Uzytkownik uzytkownik;
    private Date date;
    private Egzemplarz egzemplarz;

    /*
	public ArrayList<String> rezerwuj(String data[]) {

            
        
        }*/

    public int getNumer_rezerwacji() {
        return numer_rezerwacji;
    }

    public void setNumer_rezerwacji(int numer_rezerwacji) {
        this.numer_rezerwacji = numer_rezerwacji;
    }

    public Uzytkownik getUzytkownik() {
        return uzytkownik;
    }

    public void setUzytkownik(Uzytkownik uzytkownik) {
        this.uzytkownik = uzytkownik;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Egzemplarz getEgzemplarz() {
        return egzemplarz;
    }

    public void setEgzemplarz(Egzemplarz egzemplarz) {
        this.egzemplarz = egzemplarz;
    }



    @Override
    public String toString() {

        String rezerwacja = "\nID rezerwacji: " + getNumer_rezerwacji();
        rezerwacja += " Egzemplarz: " + getEgzemplarz();
        rezerwacja += " Użytkownik: " + getUzytkownik();
        rezerwacja += " Data: " + getDate();

        return rezerwacja;
    }

    public boolean sprawdzdate(Date date) {
        return this.date.equals(date);
    }

}
