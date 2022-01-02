package models;

public class Student extends Person{
    static String nameSchool = "CodeGym Đà Nẵng";
    private String address;
    private String email;
    private String password;

    public Student() {
    }


    public Student(int id, String name, int age, String address, String email, String password) {
        super(id, name, age);
        this.address = address;
        this.email = email;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name School = " + nameSchool +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        return super.getId() == ((Student) obj).getId();
    }

    @Override
    public int hashCode() {
        return this.id;
    }

    public String getPassword() {
        return password;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static void displaySchoolName(){
        System.out.println("Name School: " + nameSchool);
    }

}

