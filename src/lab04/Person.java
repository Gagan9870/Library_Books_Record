package lab04;

public class Person {
    private String name;
    private int age;
    private char gender;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Person(String name, int age, cgar gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
class Test{
    public static void main(String[] args) {
        Person person =new Person(name: "GAGAN" ,age: "19" ,gender: "m");
    }