package pro.xuchi.bridge;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @RequestMapping("/greeting")
    public String index() {
        return "Greeting from Springboot";
    }
}
