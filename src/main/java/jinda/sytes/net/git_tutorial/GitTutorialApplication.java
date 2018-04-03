package jinda.sytes.net.git_tutorial;

import jinda.sytes.net.git_tutorial.sample1.M_User;
import jinda.sytes.net.git_tutorial.sample1.M_UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitTutorialApplication.class, args);
	}

}
