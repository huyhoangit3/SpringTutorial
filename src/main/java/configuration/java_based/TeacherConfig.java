package configuration.java_based;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("configuration.java_based")
public class TeacherConfig {
    /*@Bean(name = "teacher1")
    @Lazy
    @Scope("singleton")
    public Teacher getBeanConfig() {
        return new Teacher();
    }
    // name of bean is teachers
    // if omit name param, name of method is set as default bean's name.
    @Bean(name = "teacher")
    // lazy load.
    @Lazy
    // scope is prototype.
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Teacher getBeanConfig1() {
        return new Teacher(1, "Hoang", 21);
    }*/
}
