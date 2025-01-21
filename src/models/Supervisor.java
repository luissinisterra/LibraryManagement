package models;

public class Supervisor extends Person{
    private String department;

    public Supervisor(String username, String password, String document, String name, String email, String phoneNumber, String address, String department) {
        super(username, password, document, name, email, phoneNumber, address);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
