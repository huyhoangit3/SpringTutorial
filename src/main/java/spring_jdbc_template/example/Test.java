package spring_jdbc_template.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_jdbc_template.Employee;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("spring_jdbc_template/example/applicationContext.xml");
        EmployeeDAO employeeDAO = (EmployeeDAO) applicationContext.getBean("edao");
        employeeDAO.save(new Employee(2, "Anh", 2000));

        List<Employee> employees = employeeDAO.findAll();
        employees.forEach(System.out::println);
    }
}
