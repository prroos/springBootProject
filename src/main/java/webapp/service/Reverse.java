package webapp.service;

import org.springframework.stereotype.Service;

@Service
public class Reverse {



    public String ReverseText(String text){
        return new StringBuilder(text).reverse().toString();
    }


}
