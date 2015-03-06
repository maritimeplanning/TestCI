/*
 * RPS ASA, Inc.
 * Copyright(c) 2015. All Rights Reserved.
 *
 * SimpleStuff.java
 *
 * Created on Mar 3, 2015 @ 1:49:29 PM
 */
package mpa.testci;

/**
 *
 * @author CBM <cmueller@asascience.com>
 */
public class SimpleStuff {

    public static double arraySum(double... vals) {
        double ret = vals[0];
        for (int i = 1; i < vals.length; i++) {
            ret += vals[i];
        }
        return ret;
    }

    public static double arraySub(double... vals) {
        double ret = vals[0];
        for (int i = 1; i < vals.length; i++) {
            ret -= vals[i];
        }
        return ret;
    }

    public static double arrayProduct(double... vals) {
        double ret = vals[0];
        for (int i = 1; i < vals.length; i++) {
            ret *= vals[i];
        }
        return ret;
    }

}
