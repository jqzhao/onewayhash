package edu.umich.privascope;

import edu.umich.privascope.utils.SHA3Util;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.*;

/**
 * Created by jqzhao on 1/24/17.
 */

@RestController
@RequestMapping("/")
public class OnewayhashController {
    private static Logger log = LogManager.getLogger(OnewayhashController.class);

    @RequestMapping(value = "/hash", method= RequestMethod.GET)
    public @ResponseBody String hash(@RequestParam(value="input") String input) {
        log.info("input is: "+input);
        return SHA3Util.sha3Hash256(input);
    }
}
