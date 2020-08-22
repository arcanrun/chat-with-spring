package com.chat.server;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.chat.server")
public class AppConfig {
    @Bean
    public Server server(AuthService authService){
        Server server = new Server();
        server.setAuthService(authService);
        return server;
    }

    @Bean
    public AuthService authService(){
        return new AuthService();
    }
}
