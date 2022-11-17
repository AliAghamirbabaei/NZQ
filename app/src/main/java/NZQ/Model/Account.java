package Model;

public class Account {
    private int id;
    private String name;
    private String nationalCode;
    private String address;
    private String tell;
    private String email;

    public Account(int id, String name, String nationalCode, String address, String tell, String email) {
        this.id = id;
        this.name = name;
        this.nationalCode = nationalCode;
        this.address = address;
        this.tell = tell;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTell() {
        return tell;
    }

    public void setTell(String tell) {
        this.tell = tell;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
