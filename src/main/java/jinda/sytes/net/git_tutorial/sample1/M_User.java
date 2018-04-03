package jinda.sytes.net.git_tutorial.sample1;

import org.springframework.data.annotation.Id;


public class M_User {

    @Id
    private String _id;

    private String firstName;
    private String lastName;

    public M_User() {
    }

    public M_User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format("M_User [id=%s, firstName='%s', lastName='%s']", _id, firstName, lastName);
    }
}
