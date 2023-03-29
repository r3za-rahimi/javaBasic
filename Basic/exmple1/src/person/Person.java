package src.person;

public class Person {

    private String firstName;
    private String lastName;
    private int age;


    public Person() {

    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if (age > 0 && age <= 100) {

            this.age = age;

        } else {

            this.age = 0;
        }
    }


    public boolean isTeen() {


        return (this.age > 12 && this.age < 20) ? true : false;

    }


    public String getFullName() {


        if (firstName.isEmpty() && lastName.isEmpty()) {
            return "EMPTY";

        }
        if (firstName.isEmpty()) {
            return lastName;
        }
        if (lastName.isEmpty()) {
            return firstName;
        } else {
            return firstName + " " + lastName;
        }


    }
}
