package info.dianmei.controller;

import info.dianmei.entity.User;
import info.dianmei.repositories.UserRepository;
import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lout on 2017/3/8.
 */
@RestController
public class WebController {

    Logger logger = Logger.getLogger(WebController.class);
    @RequestMapping("/admin")
    public String getStr(String name){
        return "success";
    }

    @RequestMapping("/user")
    public String getuser(){ return "login message";}

    @RequestMapping("/login")
    public String login(String loginName, String password){
        return loginName + password;
    }

    @RequestMapping("/register")
    public String gohome(){
        String password = "123456";
        String pwd = new BCryptPasswordEncoder().encode(password);
        logger.debug(pwd);
        return "home message";
    }

}
