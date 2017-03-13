package info.dianmei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by lout on 2017/3/8.
 */
@SpringBootApplication
@EnableAutoConfiguration
@EnableWebMvc
public class SecurityDemoApplication {

    public static void main(String[] args){
        SpringApplication.run(SecurityDemoApplication.class, args);
    }
}
