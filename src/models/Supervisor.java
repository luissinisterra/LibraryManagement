package models;

public class Supervisor extends Person{
    private String department;
    public Supervisor(String document, String name, String email, String phoneNumber, String address) {
        super(document, name, email, phoneNumber, address);
    }
}
