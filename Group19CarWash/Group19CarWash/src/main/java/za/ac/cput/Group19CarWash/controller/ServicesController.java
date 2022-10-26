package za.ac.cput.Group19CarWash.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import za.ac.cput.Group19CarWash.domain.Services;
import za.ac.cput.Group19CarWash.services.ServicesService;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Controller
public class ServicesController {

    @Autowired
    private ServicesService servicesService;

    @GetMapping(value = "/services")
    public String services(Model model) {
        List<Services> servicesList = servicesService.findAllServices();
        model.addAttribute("servicesList", servicesList);
        return "services";
    }
    @RequestMapping(value = "/newservices")
    public String showNewservices(Model model) {
        Services services = new Services();
        model.addAttribute("services", services);
        return "new_services";
    }
    @RequestMapping(value = "/saveservices", method = RequestMethod.POST)
    public String saveservices(@ModelAttribute("services") Services services) {
        servicesService.addServices(services);
        return "services";
    }
    @RequestMapping(value = "/editservices/{id}")
    public ModelAndView showEditservices(@PathVariable(name = "id") Long id) {
        ModelAndView editing = new ModelAndView("edit_services");
        Services services = servicesService.findServicesById(id);
        editing.addObject("services", services);
        return editing;
    }
    @RequestMapping(value = "/deleteservices/{id}")
    public String deleteservices(@PathVariable(name = "id")Long id) {
        servicesService.deleteServicesById(id);
        return "redirect:/services";
    }

}
