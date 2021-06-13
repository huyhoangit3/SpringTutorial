package spring_jdbc_template.prepared_statement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_jdbc_template.Employee;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("spring_jdbc_template/" +
                "prepared_statement/applicationContext.xml");
        EmployeeDAO employeeDAO = (EmployeeDAO) applicationContext.getBean("edao1");
        boolean result = employeeDAO.insert(new Employee(3, "Nhi", 1500));

        System.out.println(result);
    }
}
