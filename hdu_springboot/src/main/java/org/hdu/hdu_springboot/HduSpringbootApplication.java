package org.hdu.hdu_springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.hdu.hdu_springboot")
public class HduSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(HduSpringbootApplication.class, args);
    }

}
