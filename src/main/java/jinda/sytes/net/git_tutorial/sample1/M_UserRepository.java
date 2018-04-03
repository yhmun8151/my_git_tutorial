package jinda.sytes.net.git_tutorial.sample1;

import jinda.sytes.net.git_tutorial.sample1.M_User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface M_UserRepository extends MongoRepository<M_User, String>{
    public M_User findByFirstName(String firstName);
    public List<M_User> findByLastName(String lastName);

}
