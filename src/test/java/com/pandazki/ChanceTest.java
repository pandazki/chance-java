package com.pandazki;

import junit.framework.TestCase;
import org.apache.commons.math3.random.MersenneTwister;

public class ChanceTest extends TestCase {

    public void testString() throws Exception {
        Chance chance = new Chance(new MersenneTwister());

        for (int i = 0; i < 10; i++)
        {
            System.out.println(chance.string(Chance.CHARS_LOWER + Chance.CHARS_UPPER, 8));
        }
    }
}