package Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by etenbrinke on 04/12/15.
 */

@RestController
public class HelloController {
    @Autowired
    TestService service;

    @RequestMapping("/")
    public String index() {
        return service.call();
    }
}
