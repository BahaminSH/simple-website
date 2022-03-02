package springbootwebsite.simplewebsite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("page")
public class PageController {

    @RequestMapping("/welcome")
    public String welcome(Map<String, Object> model){

        model.put("headerMessage", "Hello Dear");
        model.put("textMessage", "This is for test");

        return "welcome";
    }

}
