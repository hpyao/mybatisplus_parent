package cn.itsource.hrm.service.impl;

import cn.itsource.hrm.domain.User;
import cn.itsource.hrm.mapper.UserMapper;
import cn.itsource.hrm.service.IUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yhptest
 * @since 2019-08-30
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
