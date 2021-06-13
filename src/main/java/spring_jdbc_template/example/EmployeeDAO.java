package spring_jdbc_template.example;

import org.springframework.jdbc.core.JdbcTemplate;
import spring_jdbc_template.Employee;

import java.util.List;

public class EmployeeDAO {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int save(Employee e) {
        String sqlQuery = "INSERT INTO employee VALUES(?,?,?)";
        return jdbcTemplate.update(sqlQuery, e.getEid(), e.geteName(), e.geteSalary());
    }

    public int update(Employee e) {
        String sql = "UPDATE employee SET name=?, salary=? WHERE id=?";
        return jdbcTemplate.update(sql, e.geteName(), e.geteSalary(), e.getEid());
    }

    public int delete(Employee e) {
        String sqlQuery = "DELETE FROM employee WHERE id=?";
        return jdbcTemplate.update(sqlQuery, e.getEid());
    }

    public List<Employee> findAll() {
        String sqlQuery = "SELECT * FROM employee";
        return jdbcTemplate.query(sqlQuery, (rs, rowNum) -> new Employee(
                rs.getInt("id"), rs.getString("name"),
                rs.getDouble("salary")));
    }
}
