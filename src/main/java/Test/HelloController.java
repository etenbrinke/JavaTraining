package Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping("/again")
    public String indexAgain() {
        return service.callAgain();
    }

    @RequestMapping(value="/json", produces = "application/json")
    @ResponseBody
    public Person getPerson(){
        Person person = new Person();
        person.setId(1);
        person.setName("ep");
        return person;
    }

    @RequestMapping(path="/user/{user}", method=RequestMethod.GET)
    @ResponseBody
    public String showPersonName(@PathVariable String user) {
        Person person = new Person();
        person.setName(user);
        return "Hello user " + person.getName();
    }

}
