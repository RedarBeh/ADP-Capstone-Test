package za.ac.cput.Group19CarWash.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import za.ac.cput.Group19CarWash.domain.CarDelivery;
import za.ac.cput.Group19CarWash.services.CarDeliveryService;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Controller
public class CarDeliveryController {
    @Autowired
    private CarDeliveryService carDeliveryService;

    @GetMapping(value = "/carDeliveries")
    public String carDeliveries(Model model) {
        List<CarDelivery> carDeliveryList = CarDeliveryService.findAllCarDeliveries();
        model.addAttribute("carDeliveryList", carDeliveryList);

        return "carDeliveries";
    }

    @RequestMapping(value = "/new")
    public String showNewCarDelivery(Model model) {
        CarDelivery carDelivery = new CarDelivery();
        model.addAttribute("carDelivery", carDelivery);

        return "new_carDelivery";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveCarDelivery(@ModelAttribute("carDelivery") CarDelivery carDelivery) {
        carDeliveryService.addCarDelivery(carDelivery);

        return "redirect:/carDeliveries";
    }

    @RequestMapping(value = "/edit/{id}")
    public ModelAndView showEditCarDelivery(@PathVariable(name = "id") Long id) {
        ModelAndView editing = new ModelAndView("edit_carDelivery");
        CarDelivery carDelivery = carDeliveryService.findCarDeliveryById(id);
        editing.addObject("carDelivery", carDelivery);

        return editing;
    }

    @RequestMapping(value = "/delete/{id}")
    public String deleteMyCarDelivery(@PathVariable(name = "id") Long id) {
        carDeliveryService.deleteCarDelivery(id);

        return "redirect:/carDeliveries";
    }

}
