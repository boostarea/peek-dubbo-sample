package com.example;

import com.example.service.ConsumerService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class Consumer
{
    public static void main( String[] args ) throws IOException {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("consumer.xml");

        ConsumerService consumer = classPathXmlApplicationContext.getBean(ConsumerService.class);
        System.out.println("Done " + consumer.consumer("consumer"));
        System.in.read();
    }
}
