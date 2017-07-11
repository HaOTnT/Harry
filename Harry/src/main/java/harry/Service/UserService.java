package harry.Service;

import harry.Dao.UserDaoImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {
    @Resource
    private UserDaoImpl userDaoImpl;

    public String test(){
        return "北京钱包";
    }
}
