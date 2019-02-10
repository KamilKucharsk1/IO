/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package.Package2;

import Package.Dane;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.FixMethodOrder;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import test_junit.TestControl;
import test_junit.TestEntity;

/**
 *
 * @author Konrad
 */
@Category({TestControl.class, TestEntity.class})
@RunWith(Parameterized.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EgzemplarzTest {
    
    Dane dane = new Dane();
    public EgzemplarzTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
   @Parameter(value = 0)
    public int numer1;
    
    @Parameter(value = 1)
    public int numer2;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data1 = new Object[][]{
            {0, 2}, {1, 3}, {2, 4}};
        return Arrays.asList(data1);
    }
    /**
     * Test of zarezerwuj method, of class Egzemplarz.
     */
    @Test
    public void testZarezerwuj() {
        System.out.println("zarezerwuj");
        Egzemplarz instance = new Egzemplarz();
        instance.zarezerwuj(dane.uzytk[numer1], dane.daty[numer2]);

    }

 
    
}
