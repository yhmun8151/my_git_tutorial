package jinda.sytes.net.git_tutorial.test;

import jinda.sytes.net.git_tutorial.sample1.M_User;
import jinda.sytes.net.git_tutorial.sample1.M_UserRepository;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class JUnitTest {

    @Autowired
    private M_UserRepository repository;

    @Test
    public void test2() {
        System.out.println("Spring boot Command line is runned....");
        repository.deleteAll();

        // save a couple of customers
        repository.save(new M_User("Alice", "Smith"));
        repository.save(new M_User("Bob", "Smith"));

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
    }

}
