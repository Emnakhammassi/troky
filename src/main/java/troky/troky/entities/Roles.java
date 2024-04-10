package troky.troky.entities;


public class Roles {
    private int id;
    private String role;

    //constructeur


    public Roles() {
    }

    public Roles(int id, String role) {
        this.id = id;
        this.role = role;
    }

    //getter and setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
