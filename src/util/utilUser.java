package util;

import beans.User;

import java.util.Scanner;

public class utilUser {
    public static User enterUser(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Zəhmət olmasa adınızı daxil eidn:");
        String name = sc.nextLine();
        System.out.println("Zəhmət olmasa soyadınızı daxil edin:");
        String surname = sc.nextLine();
        User user = new User(name,surname);
        return user;
    }
}
