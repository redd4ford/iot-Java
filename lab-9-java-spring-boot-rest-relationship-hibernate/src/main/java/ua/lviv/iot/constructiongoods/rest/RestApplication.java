package ua.lviv.iot.constructiongoods.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({
                "ua.lviv.iot.constructiongoods.rest.dataaccess",
                "ua.lviv.iot.constructiongoods.rest.business",
                "ua.lviv.iot.constructiongoods.rest.controller"
              })
@EntityScan("ua.lviv.iot.constructiongoods.model")
@EnableJpaRepositories("ua.lviv.iot.constructiongoods.rest.dataaccess")
public class RestApplication {

  public static void main(String[] args) {
    SpringApplication.run(RestApplication.class, args);
  }

}
