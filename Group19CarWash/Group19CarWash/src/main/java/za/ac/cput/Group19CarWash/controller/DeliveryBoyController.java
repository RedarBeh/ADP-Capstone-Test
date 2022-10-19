package za.ac.cput.Group19CarWash.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import za.ac.cput.Group19CarWash.domain.DeliveryBoy;
import za.ac.cput.Group19CarWash.services.DeliveryBoyService;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Controller
public class DeliveryBoyController {
    @Autowired
    private DeliveryBoyService deliveryBoyService;

    @GetMapping(value = "/deliveryBoys")
    public String deliveries(Model model) {
        List<DeliveryBoy> deliveryBoyList = DeliveryBoyService.findAllDeliveries();
        model.addAttribute("deliveryBoysList", deliveryBoyList);

        return "deliveryBoys";
    }

    @RequestMapping(value = "/new")
    public String showNewDeliveryBoy(Model model) {
        DeliveryBoy deliveryBoy = new DeliveryBoy();
        model.addAttribute("deliveryBoy", deliveryBoy);

        return "new_deliveryBoy";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveDeliveryBoy(@ModelAttribute("deliveryBoy") DeliveryBoy deliveryBoy) {
        deliveryBoyService.addDeliveryBoy(deliveryBoy);

        return "redirect:/deliveryBoys";
    }

    @RequestMapping(value = "/edit/{id}")
    public ModelAndView showEditDeliveryBoy(@PathVariable(name = "id") Long id) {
        ModelAndView editing = new ModelAndView("edit_deliveryBoy");
        DeliveryBoy deliveryBoy = deliveryBoyService.findDeliveryBoyById(id);
        editing.addObject("deliveryBoy", deliveryBoy);

        return editing;
    }

    @RequestMapping(value = "/delete/{id}")
    public String deleteMyDeliveryBoy(@PathVariable(name = "id") Long id) {
        deliveryBoyService.deleteDeliveryBoyById(id);

        return "redirect:/deliveryBoys";
    }

}
