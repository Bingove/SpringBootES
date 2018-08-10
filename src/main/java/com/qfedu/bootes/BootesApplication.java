package com.qfedu.bootes;

import com.qfedu.bootes.domain.News;
import com.qfedu.bootes.service.NewsESService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootesApplication  {

    public static void main(String[] args) {
        SpringApplication.run(BootesApplication.class, args);
    }


}
