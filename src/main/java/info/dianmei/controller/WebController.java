package info.dianmei.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lout on 2017/3/8.
 */
@RestController
public class WebController {

    @RequestMapping("/test")
    public String getStr(){ return "success";}

    @RequestMapping("/login")
    public String login(){ return "login message";}

}
