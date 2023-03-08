package com.example.lesson2;

public class Customer {

    private int id;
    private String firstName;
    private String secondName;
    private String gender;
    private int age;
    private String city;
    private String company;
    private String department;
    private String position;
    private String login;
    private String password;
    private String recoveryPassphrase;
    private int salary;
    private int bonusPercent;
    private int tax;

    public Customer(int id, String firstName, String secondName, String gender, int age, String city, String company, String department, String position, String login, String password, String recoveryPassphrase, int salary, int bonusPercent, int tax) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.gender = gender;
        this.age = age;
        this.city = city;
        this.company = company;
        this.department = department;
        this.position = position;
        this.login = login;
        this.password = password;
        this.recoveryPassphrase = recoveryPassphrase;
        this.salary = salary;
        this.bonusPercent = bonusPercent;
        this.tax = tax;
    }
    public Customer (){
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRecoveryPassphrase() {
        return recoveryPassphrase;
    }

    public void setRecoveryPassphrase(String recoveryPassphrase) {
        this.recoveryPassphrase = recoveryPassphrase;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBonusPercent() {
        return bonusPercent;
    }

    public void setBonusPercent(int bonusPercent) {
        this.bonusPercent = bonusPercent;
    }

    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", company='" + company + '\'' +
                ", department='" + department + '\'' +
                ", position='" + position + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", recoveryPassphrase='" + recoveryPassphrase + '\'' +
                ", salary=" + salary +
                ", bonusPercent=" + bonusPercent +
                ", tax=" + tax +
                '}';
    }
}
