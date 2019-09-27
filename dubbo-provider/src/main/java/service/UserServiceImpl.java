package service;

import javabean.User;

public class UserServiceImpl implements UserService{

    public void sayHi(String name) {
        User user = new User();
        user.setName(name);
        System.out.println("My name is "+name);
    }
}
