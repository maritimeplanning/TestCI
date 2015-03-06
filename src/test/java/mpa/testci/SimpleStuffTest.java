/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpa.testci;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author CBM <cmueller@asascience.com>
 */
public class SimpleStuffTest {

    public SimpleStuffTest() {
    }

    /**
     * Test of arraySum method, of class SimpleStuff.
     */
    @org.junit.Test
    public void testArraySum() {
        System.out.println("arraySum");
        double[] vals = new double[]{2, 4, 9};
        double expResult = 14;
        double result = SimpleStuff.arraySum(vals);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of arraySub method, of class SimpleStuff.
     */
    @org.junit.Test
    public void testArraySub() {
        System.out.println("arraySub");
        double[] vals = new double[]{8,4,3};
        double expResult = 1;
        double result = SimpleStuff.arraySub(vals);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of arrayProduct method, of class SimpleStuff.
     */
    @org.junit.Test
    public void testArrayProduct() {
        System.out.println("arrayProduct");
        double[] vals = new double[]{2,4,8};
        double expResult = 64;
        double result = SimpleStuff.arrayProduct(vals);
        assertEquals(expResult, result, 0.0);
    }

}
