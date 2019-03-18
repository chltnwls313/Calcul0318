package kr.hs.dgsw.webcalcul;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetController {

    @Autowired
    private GreetingService gs;
    @GetMapping("/cal/{num1}/{num2}/{operate}")
    public int sayHi(@PathVariable int num1, @PathVariable int num2, @PathVariable String operate){
        return gs.sayHi(num1, num2, operate);
    }
}
