package jinda.sytes.net.git_tutorial.controller;

import jinda.sytes.net.git_tutorial.User;
import jinda.sytes.net.git_tutorial.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin("*")
@RestController
public class UserController {

    private final Logger Log = LoggerFactory.getLogger(getClass());

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }



    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<User> getAllUsers() {
        Log.info("Getting all users.");
        return userRepository.findAll();
    }
/*

    @RequestMapping(value = "/{userId}")
    public User getUser(@PathVariable String userId) {
        Log.info("Getting user with ID : {}.", userId);
        return userRepository.findOne(userId);
    }
*/

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public User addNewUsers(@RequestBody User user) {
        Log.info("Saving user.");
        return userRepository.save(user);
    }

/*
    @RequestMapping(value = "/settings/{userId}/{key}/{value}")
    public String addUserSetting(@PathVariable String userId, @PathVariable String key, @PathVariable String value) {
        User user = userRepository.findOne(userId);
        if (user != null) {
            user.getUserSettings().put(key, value);
            userRepository.save(user);
            return "Key added";
        } else {
            return "User not found.";
        }
    }
*/

}
