package com.jzwx.spring.boot.blog.Service;

import com.jzwx.spring.boot.blog.domain.User;
import com.jzwx.spring.boot.blog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * UserServiceImpl 用户服务接口实现类
 *
 * @author jzwx
 * @version $ Id: UserServiceImpl, v 0.1 2018/2/13 20:45 jzwx Exp $
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Transactional
    @Override
    public User saveOrUpdateUser(User user) {
        return userRepository.save(user);
    }

    @Transactional
    @Override
    public User registerUser(User user) {
        return userRepository.save(user);
    }

    @Transactional
    @Override
    public void removeUser(Long id) {
        userRepository.delete(id);
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findOne(id);
    }

    @Override
    public Page<User> listUsersByNameLike(String name, Pageable pageable) {
        name = "%"+name+"%";
        Page<User> users=userRepository.findByNameLike(name,pageable);
        return users;
    }
}
