package demo;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Lazy
@Primary
public class SMSService implements MessageService{
    @Override
    public void sendMsg(String msg) {
        System.out.println("SMS service: " + msg);
    }
}
