package Entities;

public class User{
    private Integer id;
    private String name;
    private String email;
    private int mobNumber;

    public User(Integer id, String name, String email, int mobNumber) {
        this.id = id;
        setName(name);
        setEmail(email);
        setMobNumber(mobNumber);
    }

    public User(String name, String email, int mobNumber) {
       this(null,name,email,mobNumber);
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    private void setEmail(String email) {
        this.email = email;
    }

    public int getMobNumber() {
        return mobNumber;
    }

    private void setMobNumber(int mobNumber) {
        this.mobNumber = mobNumber;
    }
}
