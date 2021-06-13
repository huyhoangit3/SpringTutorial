package configuration.java_based;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new
                AnnotationConfigApplicationContext(TeacherConfig.class);
        Teacher teacher = annotationConfigApplicationContext.getBean(Teacher.class);
        System.out.println(teacher);
    }
}
