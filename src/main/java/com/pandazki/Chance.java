package com.pandazki;

import org.apache.commons.math3.random.RandomGenerator;

/**
 * Created by Pandazki on 10/16/14.
 */
public class Chance {
    public static final int MIN_VALUE = -2147483648;
    public static final int MAX_VALUE = 2147483647;
    public static final String NUMBERS = "0123456789";
    public static final String CHARS_LOWER = "abcdefghijklmnopqrstuvwxyz";
    public static final String CHARS_UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String HEX_POOL = NUMBERS + "ABCDEF";
    public static final String DEFAULT_STRING_POOL = NUMBERS + CHARS_UPPER;

    private RandomGenerator r;

    public Chance(RandomGenerator r)
    {
        if (r == null) throw new IllegalArgumentException("RandomGenerator should not be null.");
        this.r = r;
    }

    //generates a random character
    public char character(String pool)
    {
        if (pool == null || pool.length() == 0)
        {
            pool = DEFAULT_STRING_POOL;
        }
        return pool.charAt(r.nextInt(pool.length()));
    }

    //generates a random string
    public String string(String pool, int len)
    {
        if (len <= 0 || len > 65535) throw new IllegalArgumentException("len must in range (0, 65535].");
        char[] cs = new char[len];
        for (int i = 0; i < len; i++)
        {
            cs[i] = character(pool);
        }

        return new String(cs);
    }
}
