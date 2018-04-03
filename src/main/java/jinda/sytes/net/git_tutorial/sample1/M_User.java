package jinda.sytes.net.git_tutorial.sample1;

import org.springframework.data.annotation.Id;

import java.util.Date;


public class M_User {

    @Id
    private String _id;

    private String firstName;
    private String lastName;
    private Date date = new Date();

    public M_User() {
    }

    public M_User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format("[id='%s', firstName='%s', lastName='%s', date='%s']", _id, firstName, lastName, date.getTime());
    }
}
