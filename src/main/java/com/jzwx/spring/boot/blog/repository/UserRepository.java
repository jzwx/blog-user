package com.jzwx.spring.boot.blog.repository;

import com.jzwx.spring.boot.blog.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * UserRepository 接口
 *
 * @author jzwx
 * @version $ Id: UserRepository, v 0.1 2018/1/31 18:51 jzwx Exp $
 */
public interface UserRepository extends JpaRepository<User,Long>{
    /**
     * 根据用户姓名分页查询用户列表
     * @param name
     * @param pageable
     * @return
     */
    Page<User> findByNameLike(String name, Pageable pageable);

    /**
     * 根据用户账号查询用户
     * @param username
     * @return
     */
    User findByUsername(String username);
}
