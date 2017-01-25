package edu.umich.privascope.utils;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.bouncycastle.jcajce.provider.digest.SHA3;
import org.bouncycastle.util.encoders.Hex;

import java.io.UnsupportedEncodingException;


/**
 * Created by jqzhao on 1/24/17.
 */
public class SHA3Util {
    private static Logger log = LogManager.getLogger(SHA3Util.class);

    public static String sha3Hash256(String in) {
        String out="";
        log.info("Input to be hashed: "+in);
        try {
            SHA3.DigestSHA3 md = new SHA3.DigestSHA3(256);
            md.update(in.getBytes("UTF-8"));
            out = Hex.toHexString(md.digest());
            log.info("Output hashed: "+out);
        } catch (UnsupportedEncodingException e) {
            log.error("Error during hashing with SHA3", e);
        }
        return out;
    }
}
