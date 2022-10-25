package za.ac.cput.Group19CarWash.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import za.ac.cput.Group19CarWash.domain.Upholstery;
import za.ac.cput.Group19CarWash.services.UpholsteryService;

import java.util.List;

public class UpholsteryNavController {

    @Autowired
    private UpholsteryService upholsteryService;

    @GetMapping(value = "/upholstery")
    public String upholstery(Model model){
        List<Upholstery> upholsteryList = UpholsteryService.findAllUpholstery();
        model.addAttribute("upholsteryList", upholsteryList);

        return "upholstery";
    }

    @RequestMapping(value = "/newupholstery")
    public String showNewUpholstery(Model model) {
        Upholstery upholstery = new Upholstery();
        model.addAttribute("upholstery", upholstery);

        return "new_upholstery";
    }

    @RequestMapping(value = "/saveupholstery", method = RequestMethod.POST)
    public String saveUpholstery(@ModelAttribute("upholstery") Upholstery upholstery){
        upholsteryService.addUpholstery(upholstery);

        return "redirect:/upholstery";
    }

    @RequestMapping(value = "/editupholstery/{id}")
    public ModelAndView showEditUpholstery(@PathVariable(name = "id") Long id) {
        ModelAndView editing = new ModelAndView("edit_upholstery");
        Upholstery upholstery = upholsteryService.findUpholsteryById(id);
        editing.addObject("upholstery", upholstery);

        return editing;
    }

    @RequestMapping(value = "/deleteupholstery/{id}")
    public String deleteUpholstery(@PathVariable(name = "id") Long id) {
        upholsteryService.deleteUpholsteryById(id);

        return "redirect:/upholstery";
    }
}
