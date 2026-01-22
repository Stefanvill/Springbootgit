package se.iths.stefan.ovningspringboot.service;

import org.springframework.stereotype.Service;
import se.iths.stefan.ovningspringboot.model.User;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    public List<User> userList() {
        ArrayList<User> userList = new ArrayList<>();
        User user1 = new User("NifelD", "dingo@mail.com", "NifDingo20");
        User user2 = new User("TestJoe", "TJ@mail.com", "22Test");
        userList.add(user1);
        userList.add(user2);
        return userList;
    }
}
