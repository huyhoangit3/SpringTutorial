package spring_jdbc_template.prepared_statement;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import spring_jdbc_template.Employee;

public class EmployeeDAO {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    public Boolean insert(Employee e) {
        String sqlQuery = "INSERT INTO employee VALUES(?,?,?)";
        return jdbcTemplate.execute(sqlQuery, (PreparedStatementCallback<Boolean>) ps -> {
            ps.setInt(1, e.getEid());
            ps.setString(2, e.geteName());
            ps.setDouble(3, e.geteSalary());
            return ps.execute();
        });
    }
}
