package edu.umich.privascope.utils;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jqzhao on 1/24/17.
 */
public class SHA3UtilTest {
    @Test
    public void testSha3Hash256ForEmptyString() {
        // sha3_256 hash result
//        assertTrue(SHA3Util.sha3Hash256("").equals("a7ffc6f8bf1ed76651c14756a061d662f580ff4de43b49fa82d80a4b80f8434a"));
        // Maven run hash result (keccak_256)
        assertTrue(SHA3Util.sha3Hash256("").equals("c5d2460186f7233c927e7db2dcc703c0e500b653ca82273b7bfad8045d85a470"));
    }
    @Test
    public void testSha3Hash256ForFox(){
        // sha3_256 hash result
//        assertTrue(SHA3Util.sha3Hash256("The quick brown fox jumps over the lazy dog").equals("69070dda01975c8c120c3aada1b282394e7f032fa9cf32f4cb2259a0897dfc04"));
        // Maven run hash result (keccak_256)
        assertTrue(SHA3Util.sha3Hash256("The quick brown fox jumps over the lazy dog").equals("4d741b6f1eb29cb2a9b9911c82f56fa8d73b04959d3d9d222895df6c0b28aa15"));
    }

    @Test
    public void testSha3Hash256ForFoxWithDot(){
        // sha3_256 hash result
//        assertTrue(SHA3Util.sha3Hash256("The quick brown fox jumps over the lazy dog.").equals("a80f839cd4f83f6c3dafc87feae470045e4eb0d366397d5c6ce34ba1739f734d"));
        // Maven run hash result (keccak_256)
        assertTrue(SHA3Util.sha3Hash256("The quick brown fox jumps over the lazy dog.").equals("578951e24efd62a3d63a86f7cd19aaa53c898fe287d2552133220370240b572d"));
    }
}