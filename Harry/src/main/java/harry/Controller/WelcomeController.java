package harry.Controller;

import harry.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class WelcomeController {
    @Resource
    private UserService userService;

    @RequestMapping(value = "/welcome")
    public String Hello(Model model){
        String test = userService.test();
        model.addAttribute("test",test);
        return "hello";
    }

}
