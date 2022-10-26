package za.ac.cput.Group19CarWash.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import za.ac.cput.Group19CarWash.domain.Administrator;
import za.ac.cput.Group19CarWash.services.AdministratorService;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Controller
public class AdministratorController {

    @Autowired
    private AdministratorService administratorService;

    @GetMapping(value = "/administrator")
    public String administrator(Model model) {
        List<Administrator> administratorList = AdministratorService.findAllAdministrator();
        model.addAttribute("administratorList", administratorList);
        return "administrator";
    }
    @RequestMapping(value = "/newadministrator")
    public String showNewAdministrator(Model model) {
        Administrator administrator = new Administrator();
        model.addAttribute("administrator", administrator);
        return "new_administrator";
    }
    @RequestMapping(value = "/saveadministrator", method = RequestMethod.POST)
    public String saveAdministrator(@ModelAttribute("administrator") Administrator administrator) {
        administratorService.addAdministrator(administrator);
        return "administrator";
    }
    @RequestMapping(value = "/editadministrator/{id}")
    public ModelAndView showEditAdministrator(@PathVariable(name = "id") Long id) {
        ModelAndView editing = new ModelAndView("edit_administrator");
        Administrator administrator = administratorService.findAdminById(id);
        editing.addObject("administrator", administrator);
        return editing;
    }
    @RequestMapping(value = "/deleteadministrator/{id}")
    public String deleteAdministrator(@PathVariable(name = "id")Long id) {
        administratorService.deleteAdministratorById(id);
        return "redirect:/administrator";
    }

}
