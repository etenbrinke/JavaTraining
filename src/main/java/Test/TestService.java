package Test;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.websocket.server.ServerEndpoint;

/**
 * Created by etenbrinke on 04/12/15.
 */
@Service
public class TestService {

    public String call() {
        return "Greetings from Spring Boot!";
    }

    public String callAgain() {
        return "Greetings again from Spring Boot!";
    }

}
