package rocabee.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import rocabee.model.RandomNumber;

import java.util.ArrayList;



@org.springframework.stereotype.Controller
public class Controller {

    @ModelAttribute
    public RandomNumber randomNumber(){
        return new RandomNumber();
    }


    // http://localhost:8080/ServletResponse/
    @RequestMapping
    public String arataNumerele(Model model) {
        ArrayList<Integer> list = randomNumber().myNumbers();

        model.addAttribute("listaNumere", list);

        return "number_list";
    }

//    @ResponseBody
//    @GetMapping ("/numbers")
//    public String numbers (@ModelAttribute("rdNumber") RandomNumber rdNumber){
//
//
//        return rdNumber.myNumbers().toString();
//    }
}
