package case_study.models;

import case_study.models.Person;

public class Customer extends Person {
    public static final String DIAMOND = "DIAMOND";
    public static final String PLATINIUM = "Platinium";
    public static final String GOLD = "Gold";
    public static final String SILVER = "Silver";
    public static final String MEMBER = "Member";
    private String typeOfCustomer;
    private String address;
    private int customerCode;

    public Customer(String name, int born, String gender, int cmnd, int sdt, String email, String typeOfCustomer, String address, int customerCode) {
        super(name, born, gender, cmnd, sdt, email);
        this.typeOfCustomer = typeOfCustomer;
        this.address = address;
        this.customerCode = customerCode;
    }

    public Customer(String typeOfCustomer, String address, int customerCode) {
        this.typeOfCustomer = typeOfCustomer;
        this.address = address;
        this.customerCode = customerCode;
    }

    public String gettypeOfCustomer() {
        return typeOfCustomer;
    }

    public void settypeOfCustomer(String typeOfCustomer) {
        this.typeOfCustomer = typeOfCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public  int getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(int customerCode) {
        this.customerCode = customerCode;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "typeOfCustomer='" + typeOfCustomer + '\'' +
                ", address='" + address + '\'' +
                ", customerCode=" + customerCode +
                '}';
    }
}