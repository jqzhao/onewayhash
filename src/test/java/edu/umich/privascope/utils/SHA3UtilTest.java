package edu.umich.privascope.utils;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jqzhao on 1/24/17.
 */
public class SHA3UtilTest {
    @Test
    public void testSha3Hash256ForEmptyString() {
        assertTrue(SHA3Util.sha3Hash256("").equals("a7ffc6f8bf1ed76651c14756a061d662f580ff4de43b49fa82d80a4b80f8434a"));
    }
    @Test
    public void testSha3Hash256ForFox(){
        assertTrue(SHA3Util.sha3Hash256("The quick brown fox jumps over the lazy dog").equals("69070dda01975c8c120c3aada1b282394e7f032fa9cf32f4cb2259a0897dfc04"));
    }

    @Test
    public void testSha3Hash256ForFoxWithDot(){
        assertTrue(SHA3Util.sha3Hash256("The quick brown fox jumps over the lazy dog.").equals("a80f839cd4f83f6c3dafc87feae470045e4eb0d366397d5c6ce34ba1739f734d"));
    }
}