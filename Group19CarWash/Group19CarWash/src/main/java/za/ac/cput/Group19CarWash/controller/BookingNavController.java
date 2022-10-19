
/*
Keallan Saunders 219169357
ADP3 ASSIGNMENT1
DD: Oct 2022
BookingNavController.java
**************** DO NOT TOUCH ********************
 */package za.ac.cput.Group19CarWash.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import za.ac.cput.Group19CarWash.domain.Bookings;
import za.ac.cput.Group19CarWash.domain.Customer;
import za.ac.cput.Group19CarWash.services.BookingService;
import za.ac.cput.Group19CarWash.services.CustomerService;

import javax.transaction.Transactional;
import java.util.List;


@Transactional
@Controller
public class BookingNavController {

    @Autowired
    private BookingService bookingService;

    @GetMapping(value= "/bookings")
    public String bookings(Model model){
        List<Bookings> bookingsList = BookingService.findAllBookings();
        model.addAttribute("bookingsList", bookingsList);

        return "bookings";
    }
    @RequestMapping(value= "/new")
    public String showNewBooking(Model model){
        Bookings bookings = new Bookings();
        model.addAttribute("bookings", bookings);

        return "new_booking";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveBooking(@ModelAttribute("bookings") Bookings bookings)
    {bookingService.addBooking(bookings);

        return "redirect:/newcus";
    }

    @RequestMapping(value= "/edit/{id}")
    public ModelAndView showEditBooking(@PathVariable(name = "id") Long id ){
        ModelAndView editing = new ModelAndView("edit_booking");
        Bookings bookings = bookingService.findBookingById(id);
        editing.addObject("bookings", bookings);

        return editing;
    }
    @RequestMapping(value= "/delete/{id}")
    public String deleteMyBooking(@PathVariable(name = "id") Long id ) {
        bookingService.deleteBookingById(id);

        return "redirect:/bookings";
    }

}
