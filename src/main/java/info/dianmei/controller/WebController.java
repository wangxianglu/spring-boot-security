package info.dianmei.controller;

import info.dianmei.entity.User;
import info.dianmei.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lout on 2017/3/8.
 */
@RestController
public class WebController {



    @RequestMapping("/test")
    public String getStr(String name){
        return "success";
    }

    @RequestMapping("/login")
    public String login(){ return "login message";}

}
