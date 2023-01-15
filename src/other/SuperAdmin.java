package other;

import main.User;

public class SuperAdmin extends User {
    public void print(){
        System.out.println(defaultName);
        System.out.println(publicName);
        System.out.println(protectedName);
        System.out.println(privateName);
    }
}
