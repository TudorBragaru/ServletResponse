package rocabee.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;
import rocabee.model.RandomNumber;


@org.springframework.stereotype.Controller
public class Controller {

    @ResponseBody
    @GetMapping ("/numbers")
    public String numbers (@ModelAttribute("rdNumber") RandomNumber rdNumber){



   //    for (int i =0; i < rdNumber.myNumbers().size(); i++) {
   //       Integer gameNumer = (Integer)rdNumber.myNumbers().get(i);
   //        return ((gameNumer.toString()));
   //     }
        return rdNumber.myNumbers().toString();
    }
}
