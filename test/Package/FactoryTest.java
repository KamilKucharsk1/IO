/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package;

import Package.Package2.Egzemplarz;
import Package.Package2.Rezerwacja;
import Package.Package2.Uzytkownik;
import Package.Package2.filmTitle;
import java.util.Date;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Konrad
 */
public class FactoryTest {
    public static Dane dane = new Dane();
    public FactoryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    
     /**
     * Test of createFilmTitle method, of class Factory.
     */
  @Test
    public void testCreateFilmTitle() {
        System.out.println("createFilmTitle");
    
        Factory instance = new Factory();
                for (int i = 0; i < 2; ++i) {
            filmTitle result = instance.createFilmTitle(dane.daneFilmow[i]);
            assertEquals(dane.filmy[i], result);
        }
        
    }
    

    
    
     
    @Test
    public void testCreateEgzemplarz() {
        System.out.println("createEgzemplarz");
       
        Factory instance = new Factory();
     
      
          for (int i = 0; i < 2; ++i) {
             Egzemplarz result = instance.createEgzemplarz(dane.daneEgz[i]);
            assertEquals(dane.egz[i], result);
        }

    }

 
    @Test
    public void testCreateUzytkownik() {
        System.out.println("createUzytkownik");

        Factory instance = new Factory();

          for (int i = 0; i < 2; ++i) {
             Uzytkownik result = instance.createUzytkownik(dane.daneUz[i]);
            assertEquals(dane.uzytk[i], result);
        }

    }

 
  
}
