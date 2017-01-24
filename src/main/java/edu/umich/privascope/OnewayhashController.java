package edu.umich.privascope;

import edu.umich.privascope.utils.SHA3Util;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by jqzhao on 1/24/17.
 */

@Controller
@RequestMapping("/hash")
public class OnewayhashController {

    @RequestMapping(method= RequestMethod.GET)
    public @ResponseBody String hash(@RequestParam(value="input") String input) {
        return SHA3Util.sha3Hash256(input);
    }
}
