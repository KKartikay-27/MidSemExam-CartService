package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CartController {
    @RequestMapping("")
    public String display(){
        return "index";
    }
}
