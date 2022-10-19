package za.ac.cput.Group19CarWash.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import za.ac.cput.Group19CarWash.domain.Bookings;
import za.ac.cput.Group19CarWash.domain.Customer;
import za.ac.cput.Group19CarWash.services.BookingService;
import za.ac.cput.Group19CarWash.services.CustomerService;

import java.util.List;

@Controller
public class AllBookingConrtroller {

    @GetMapping(value= "/allbookings")
    public String allbookings(Model model){
        List<Bookings> bookingsList = BookingService.findAllBookings();
        List<Customer> customerList = CustomerService.findAllCustomers();
        model.addAttribute("bookingsList", bookingsList);
        model.addAttribute("customerList", customerList);

        return "all_bookings";
    }
}
