package webapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import webapp.service.Reverse;

@RestController
public class ReverseController {

    @Autowired
    Reverse reverse;

    @RequestMapping("/reverse")
    public String index(@RequestBody String text) {
        return reverse.ReverseText(text);
    }
}
