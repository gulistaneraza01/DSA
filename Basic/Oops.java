package Basic;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void fullName() {
        System.out.println(this.name + " " + this.age);

    }

    public void sum() {
        System.out.println("no argument");
    }

    public void sum(int a) {
        System.out.println("one argument" + a);
    }

    public void sum(int a, int b) {
        System.out.println("sum=" + (a + b));
    }
}

class InsidePerson extends Person {
    String address;

    InsidePerson(String name, int age, String address) {
        super(name, age);
        this.address = address;
    }

    public void fullName() {
        System.out.println(String.format("%s %s %d", name, address, age));
    }
}

public class Oops {
    public static void main(String[] args) {
        Person p1 = new Person("raza", 10);

        InsidePerson ip1 = new InsidePerson("gulistane", 20, "bangalore");

        ip1.fullName();
        p1.fullName();
    }
}
