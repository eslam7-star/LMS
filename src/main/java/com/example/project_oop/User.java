package com.example.project_oop;

public class User {
    public int ID;
    private String Password;
    private String Type;
    private String FirstName;
    private String LastName;
    private String Address;
    private String CellPhone;
    private String Email;
    private boolean isBlocked;

    public User(String Password, String Type, String FirstName, String LastName, String Address, String CellPhone, String Email, boolean isBlocked) {
        this.Password = Password;
        this.Type = Type;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Address = Address;
        this.CellPhone = CellPhone;
        this.Email = Email;
        this.isBlocked = isBlocked;
    }


    public int getID() {
        return ID;
    }


    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getCellPhone() {
        return CellPhone;
    }

    public void setCellPhone(String CellPhone) {
        this.CellPhone = CellPhone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public boolean getIsBlocked() {
        return isBlocked;
    }

    public void setIsBlocked(boolean isBlocked) {
        this.isBlocked = isBlocked;
    }

    @Override
    public String toString() {
        return "User{" +
                "ID=" + ID +
                ", Password='" + Password + '\'' +
                ", Type='" + Type + '\'' +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Address='" + Address + '\'' +
                ", CellPhone='" + CellPhone + '\'' +
                ", Email='" + Email + '\'' +
                ", isBlocked=" + isBlocked +
                '}';
    }




}
