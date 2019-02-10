/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package.Package2;

import java.util.Arrays;
import Package.Dane;
import java.util.Collection;
import java.util.Date;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


/**
 *
 * @author Konrad
 */
@RunWith(Parameterized.class)

public class RezerwacjaTest {
    Dane dane = new Dane();
    public RezerwacjaTest() {
    }
    
    @Parameterized.Parameter
    public int numer1;
    
     @Parameterized.Parameters
        public static Collection<Object[]> data() {
    Object[][] data1 = new Object[][]{ {0}, {1}, {2}, {3}, {4}, {5}, {6}, {7} };
    return Arrays.asList(data1);
    }

    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of sprawdzdate method, of class Rezerwacja.
     */
    @Test
    public void testSprawdzdate() {
        System.out.println("sprawdzdate");
        

        for(int j=numer1;j<7;j++)
        {
        if(numer1==j)
        assertTrue(dane.danedaty[numer1].equals(dane.danedaty[j])); 
        else 
        assertFalse(dane.danedaty[numer1].equals(dane.danedaty[j])); 
        }

       
    }
    
}
