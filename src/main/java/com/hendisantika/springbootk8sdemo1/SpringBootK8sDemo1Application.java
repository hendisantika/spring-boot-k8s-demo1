package com.hendisantika.springbootk8sdemo1;

import lombok.Builder;
import lombok.Data;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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