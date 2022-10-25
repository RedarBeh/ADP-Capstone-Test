package za.ac.cput.Group19CarWash.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import za.ac.cput.Group19CarWash.domain.Car;
import za.ac.cput.Group19CarWash.services.CarService;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Controller
public class CarNavController {

    @Autowired
    private CarService carService;

    @GetMapping(value = "/car")
    public String car(Model model) {
        List<Car> carList = CarService.findAllCars();
        model.addAttribute("carList", carList);

        return "car";
    }
    @RequestMapping(value = "/newcar")
    public String showNewCar(Model model) {
        Car car = new Car();
        model.addAttribute("car", car);

        return "new_car";
    }

    @RequestMapping(value = "/savecar", method = RequestMethod.POST)
    public String saveCar(@ModelAttribute("car") Car car) {
        carService.addCar(car);

        return "redirect:/car";
    }

    @RequestMapping(value = "/editcar/{id}")
    public ModelAndView showEditCar(@PathVariable(name = "id") Long id) {
        ModelAndView editing = new ModelAndView("edit_car");
        Car car = carService.findCarById(id);
        editing.addObject("car", car);

        return editing;
    }

    @RequestMapping(value = "/deletecar/{id}")
    public String deleteCar(@PathVariable(name = "id") Long id){
        carService.deleteCarById(id);

        return "redirect:/car";
    }
}
