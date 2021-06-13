package demo;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class ZaloService implements MessageService{
    @Override
    public void sendMsg(String msg) {
        System.out.println("Zalo service: " + msg);
    }
}
