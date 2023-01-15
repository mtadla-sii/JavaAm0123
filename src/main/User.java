package main;

public class User {
    String defaultName;
    public String publicName;
    protected String protectedName;
    private String privateName;

    public void print(){
        System.out.println(defaultName);
        System.out.println(publicName);
        System.out.println(protectedName);
        System.out.println(privateName);
    }
}
