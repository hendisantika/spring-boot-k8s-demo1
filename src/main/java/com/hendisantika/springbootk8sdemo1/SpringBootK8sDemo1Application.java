package com.hendisantika.springbootk8sdemo1;

import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringBootK8sDemo1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootK8sDemo1Application.class, args);
    }

}

@Builder
@Data
class Application {
    private String name;
    private String version;
}

@Slf4j
@RestController
class HelloResource {
    @Autowired
    private Environment env;

}