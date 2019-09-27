package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ClassLoad {
    public static void main(String[] args) throws IOException {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("provider.xml");
        ((ClassPathXmlApplicationContext) ioc).start();

        System.in.read();
    }
}
