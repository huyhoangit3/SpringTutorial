package spring_aop.dtd_based;

public class PrintService {
    public String printHelloTo(String name) throws PrinterProblem {
        if(name.length() > 10) {
            System.out.println("Throwing exception...");
            throw new PrinterProblem("Message is greater than 10 characters.");
        }
        else {
            System.out.println("Invoked.");
            return "Hello, " + name;
        }
    }
}
