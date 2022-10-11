package org.example.Controller;


import org.example.Component.Player;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/athlete")
public class PlayerController {

    @RequestMapping("/showPlayerForm")
    public String showPlayerForm(Model model)
    {
        model.addAttribute("athlete", new Player());
        return "add-player-form";
    }

    @InitBinder
    public void initBinder(WebDataBinder binder)
    {

        StringTrimmerEditor editor=new StringTrimmerEditor(true);
        binder.registerCustomEditor(String.class,editor);
    }

    @RequestMapping("/showPlayerDetails")
    public String showPlayerDetails(@Valid @ModelAttribute("athlete") Player myplayer, BindingResult result)
    {
        System.out.println(myplayer);
        if(result.hasErrors()) {
            System.out.println(result);
            return "add-player-form";
        }
        return "show-player-form";
    }
}
