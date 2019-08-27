package my.projects.jx.hi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by asamba on 8/26/19.
 */
@RestController
public class HiController {

    @GetMapping("/hi")
    public String sayHi(){
        return "Hi - World!";
    }
}
