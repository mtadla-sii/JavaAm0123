package main;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        System.out.println(user.defaultName);
        System.out.println(user.publicName);
        System.out.println(user.protectedName);
        System.out.println(user.privateName);
    }
}
