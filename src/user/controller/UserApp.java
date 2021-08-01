package user.controller;

import user.model.User;

public class UserApp {

    public static void main(String[] args) {
        User user = new User("peter@gmail.com", "23b456Ab!");
        user.setPassword("2356Ab"); // почему покказывает ок???
        System.out.println(user.getPassword());


//        System.out.println(user.getEmail());
//        User user2 = new User("peter@mail.ru", "1233");
//        user2.setEmail("peter@mail.ru");
//        System.out.println(user2);
//       user.setPassword("123yiAjhjkl");

    }

}
