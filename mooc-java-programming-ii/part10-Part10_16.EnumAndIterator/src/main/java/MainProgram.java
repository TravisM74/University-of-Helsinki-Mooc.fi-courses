
public class MainProgram {

    public static void main(String[] args) {
        // test your classes here
        Employees employees = new Employees();
        
        Person anna = new Person("Anna", Education.PHD);
        employees.add(anna);
        employees.print(Education.PHD);
        employees.fire(Education.PHD);
        employees.print();
    }
}
