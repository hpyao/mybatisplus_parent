package cn.itsource.hrm;

import cn.itsource.hrm.domain.User;
import cn.itsource.hrm.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class UserServiceTest {
    @Autowired
    private IUserService userService;

    @Test
    public void testGetAll()throws Exception{

        System.out.println(userService.selectById(1L));
//        userService.insert(new User());
//        userService.updateById(new User());
//        userService.deleteById(1L);
        for (User user : userService.selectList(null)) {
            System.out.println(user);
        }
    }
}
