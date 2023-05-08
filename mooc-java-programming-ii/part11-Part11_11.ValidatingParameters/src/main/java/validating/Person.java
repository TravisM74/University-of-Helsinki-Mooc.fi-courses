package validating;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        if((name == null) || (name.length() > 40) || name.isEmpty()){
            throw new IllegalArgumentException("Must have a name and be less then 40 characters");
        }
        this.name = name;
        if ((age < 0 ) || (age > 120)){
            throw new IllegalArgumentException("Age must be greter then 0 and less then 121");
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
