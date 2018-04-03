package jinda.sytes.net.git_tutorial;

import jinda.sytes.net.git_tutorial.sample1.M_User;
import jinda.sytes.net.git_tutorial.sample1.M_UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitTutorialApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(GitTutorialApplication.class, args);
	}

	@Autowired
	private M_UserRepository repository;

	@Override
	public void run(String... args) throws Exception {
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
	}
}
