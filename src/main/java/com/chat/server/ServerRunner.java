package com.chat.server;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServerRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("context.config.xml");
        Server server = applicationContext.getBean("server", Server.class);
        server.start();
    }
}
