package za.ac.cput.Group19CarWash.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import za.ac.cput.Group19CarWash.domain.Cleaner;
import za.ac.cput.Group19CarWash.services.CleanerService;

import java.util.List;

public class CleanerController {

    @Autowired
    private CleanerService CleanerService;

    @GetMapping(value = "/Cleaner")
    public String Cleaner(Model model) {
        List<Cleaner> CleanerList = CleanerService.findAllCleaner();
        model.addAttribute("CleanerList", CleanerList);
        return "cleaner";
    }
    @RequestMapping(value = "/newcleaner")
    public String showNewAdministrator(Model model) {
        Cleaner cleaner = new Cleaner();
        model.addAttribute("cleaner", cleaner);
        return "new_administrator";
    }
    @RequestMapping(value = "/saveCleaner", method = RequestMethod.POST)
    public String saveCleaner(@ModelAttribute("cleaner") Cleaner cleaner) {
        CleanerService.addCleaner(cleaner);
        return "cleaner";
    }
    @RequestMapping(value = "/editcleaner/{id}")
    public ModelAndView showEditCleaner(@PathVariable(name = "id") Long id) {
        ModelAndView editing = new ModelAndView("edit_cleaner");
        Cleaner cleaner = CleanerService.findCleanerById(id);
        editing.addObject("administrator", cleaner);
        return editing;
    }
    @RequestMapping(value = "/deletecleaner/{id}")
    public String deleteCleaner(@PathVariable(name = "id")Long id) {
        CleanerService.deleteAdministratorById(id);
        return "redirect:/administrator";
    }

}
