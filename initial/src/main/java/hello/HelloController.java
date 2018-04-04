package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@RestController
public class HelloController {
    
    @RequestMapping({"/restcontrol", "/restControl", "/restController"})
    public String index(@RequestParam(name="name", required=false, defaultValue = "World")String name, Model model) {
        model.addAttribute("name", name);
        System.out.println("in rest Controller");
        return "restpage - not serving HTML";
    }
    
}
