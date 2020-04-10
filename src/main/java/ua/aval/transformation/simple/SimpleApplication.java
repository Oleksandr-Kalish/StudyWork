package ua.aval.transformation.simple;

import org.apache.tomcat.jni.Library;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import ua.aval.transformation.simple.configuration.DateTimeConfig;

@SpringBootApplication
//@EnableConfigurationProperties(DateTimeConfig.class)
public class SimpleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleApplication.class, args);
    }

}
