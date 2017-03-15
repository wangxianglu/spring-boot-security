package info.dianmei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * Created by lout on 2017/3/8.
 */
@SpringBootApplication
@EnableConfigurationProperties
public class SecurityDemoApplication {

    public static void main(String[] args){
        SpringApplication.run(SecurityDemoApplication.class, args);
    }

}
