package com.example.damian;

import com.example.damian.util.MyUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringConsoleApplication implements CommandLineRunner {
    @Autowired
    private MyUtil util;

    public static void main(String[] args) {
        SpringApplication.run(SpringConsoleApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(util.sayHi("Rodo"));
    }

//    @Configuration
//    class Config {
//        @Bean
//        public MyUtil myUtil() {
//            return new MyUtil();
//        }
//    }
}
