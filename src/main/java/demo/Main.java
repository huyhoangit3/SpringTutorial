package demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        ChatApp chatApp = ac.getBean(ChatApp.class);
        chatApp.getMessageService().sendMsg("Hello Hoang Anh");
        ac.close();
    }
}
