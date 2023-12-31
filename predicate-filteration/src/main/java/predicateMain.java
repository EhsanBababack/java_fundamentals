import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class predicateMain {
    public static void main(String[] args) {
        Employee employee = new Employee("Amirehsan",31,"Male");
        Employee employee2 = new Employee("Ali",31,"Male");
        Employee employee3 = new Employee("Zahra",23,"Female");
        Employee employee4 = new Employee("Shadi",37,"Female");
        Employee employee5 = new Employee("Ehsan",37,"Male");
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);
        System.out.println(filteredList(employeeList,isAgeAdult(25)));
        System.out.println(filteredList(employeeList,isAgeAdult(32)));
    }
    public static Predicate<Employee> isAgeAdult(Integer age){
        return  p -> p.getAge()>age;
    }
    public static List<Employee> filteredList(List<Employee> employees , Predicate<Employee> predicate){
        return employees.stream()
                .filter(predicate)
                .collect(Collectors.<Employee>toList());
    }
}
