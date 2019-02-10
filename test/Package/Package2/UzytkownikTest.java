/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package.Package2;

import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Konrad
 */
public class UzytkownikTest {
    
    public UzytkownikTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of dodajrezerwacje method, of class Uzytkownik.
     */
    @Test
    public void testDodajrezerwacje() {
        System.out.println("dodajrezerwacje");
        Rezerwacja rez = null;
        Uzytkownik instance = new Uzytkownik();
        
        instance.dodajrezerwacje(rez);
      
    }
    
}
