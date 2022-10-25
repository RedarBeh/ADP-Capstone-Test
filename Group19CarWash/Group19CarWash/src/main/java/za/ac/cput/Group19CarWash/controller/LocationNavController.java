package za.ac.cput.Group19CarWash.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import za.ac.cput.Group19CarWash.domain.Bookings;
import za.ac.cput.Group19CarWash.domain.Location;
import za.ac.cput.Group19CarWash.services.LocationService;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Controller
public class LocationNavController {

    @Autowired
    private LocationService locationService;

    @GetMapping(value = "/locations")
    public String locations(Model model){
        List<Location> locationList = LocationService.findAllLocations();
        model.addAttribute("locationList", locationList);

        return "location";
    }
    @RequestMapping(value= "/newlocation")
    public String showNewLocation(Model model){
        Location location = new Location();
        model.addAttribute("location", location);

        return "new_location";
    }
    @RequestMapping(value = "/saveLocation", method = RequestMethod.POST)
    public String saveLocation(@ModelAttribute("location") Location location)
    {
        locationService.addLocation(location);
        return  "redirect:/locations";
    }
    @RequestMapping(value= "/editLocation/{id}")
    public ModelAndView showEditLocation(@PathVariable(name = "id") Long id ){
        ModelAndView editing = new ModelAndView("edit_location");
        Location location = locationService.findById(id);
        editing.addObject("locations", location);

        return editing;
    }
    @RequestMapping(value= "/deleteLocation/{id}")
    public String deleteMyLocation(@PathVariable(name = "id") Long id ) {
        locationService.deleteById(id);

        return "redirect:/locations";
    }

}
