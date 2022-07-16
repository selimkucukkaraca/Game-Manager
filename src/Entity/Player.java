package Entity;

import java.util.Date;

public class Player {

    private int id;
    private String firstName;
    private String lastName;
    private String tckn;
    private String birthDay;
    private Date createDate;

    public Player(String firstName, String lastName, String  tckn, String birthDay,int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.tckn = tckn;
        this.birthDay = birthDay;
        this.id = id;
    }

    public Player() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTckn() {
        return tckn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setTckn(String tckn) {
        this.tckn = tckn;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }
}
