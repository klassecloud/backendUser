package cloud.klasse.backenduser;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstController {

    @RequestMapping ("/")
    public String index () {
        return "First Page: Klasse.cloud. Backend user :)";
    }
}
