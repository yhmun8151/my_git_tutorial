package jinda.sytes.net.git_tutorial.sample1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/db")
@CrossOrigin("*")
public class M_Controller {

    @Autowired
    private M_UserRepository repository;


    @RequestMapping("/test")
    public String test() {
        System.out.println("Spring boot Command line is runned....");
        this.repository.deleteAll();

        // save a couple of customers
        this.repository.save(new M_User("Alice", "Smith"));
        this.repository.save(new M_User("Bob", "Smith"));

        // fetch all customers
        System.out.println("Customers found with findAll():");
        System.out.println("-------------------------------");
        for (M_User user : this.repository.findAll()) {
            System.out.println(user);
        }
        System.out.println();

        // fetch an individual customer
        System.out.println("Customer found with findByFirstName('Alice'):");
        System.out.println("--------------------------------");
        System.out.println(this.repository.findByFirstName("Alice"));

        System.out.println("Customers found with findByLastName('Smith'):");
        System.out.println("--------------------------------");
        for (M_User user : this.repository.findByLastName("Smith")) {
            System.out.println(user);
        }

        return repository.findAll().toString();
    }
}
