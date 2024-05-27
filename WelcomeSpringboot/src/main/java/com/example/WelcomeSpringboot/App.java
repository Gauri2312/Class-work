//WAp to print Welcome to springboot on mappping "/home"

package com.example.WelcomeSpringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan
@EnableAutoConfiguration
public class App 
{
    public static void main( String[] args )
    {
    	SpringApplication springApplication=new SpringApplication(App.class);
		springApplication.run();
    }
}
