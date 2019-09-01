package main;

import TCPClientt.TCPClient;
import beans.User;
import util.utilUser;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
       System.out.println(utilUser.enterUser());
       TCPClient.pathNameAndPortName();
    }

}
