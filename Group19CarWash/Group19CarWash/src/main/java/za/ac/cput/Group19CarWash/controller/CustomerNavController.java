package za.ac.cput.Group19CarWash.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import za.ac.cput.Group19CarWash.domain.Customer;
import za.ac.cput.Group19CarWash.services.CustomerService;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Controller
public class CustomerNavController {

    @Autowired
    private CustomerService customerService;

    @GetMapping(value= "/customer")
    public String customer(Model model) {
        List<Customer> customerList = CustomerService.findAllCustomers();
        model.addAttribute("customerList", customerList);

        return "customer";
    }
    @RequestMapping(value= "/newcus")
    public String showNewCustomer(Model model) {
        Customer customer = new Customer();
        model.addAttribute("customer", customer );

        return "new_customer";
    }

    @RequestMapping(value = "/savecus", method = RequestMethod.POST)
    public String saveCustomer(@ModelAttribute("customer") Customer customer) {
        customerService.addCustomer(customer);

        return "customer";
    }

    @RequestMapping(value= "/editcus/{id}")
    public ModelAndView showEditCustomer(@PathVariable(name = "id") Long id) {
        ModelAndView editing = new ModelAndView("edit_customer");
        Customer customer = customerService.findCustomerById(id);
        editing.addObject("customer", customer);

        return editing;
    }

    @RequestMapping(value= "/deletecus/{id}")
    public String deleteCustomer(@PathVariable(name = "id") Long id) {
        customerService.deleteCustomerById(id);

        return "redirect:/customer";
    }
}
