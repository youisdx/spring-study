package com.spring.orm.service.Impl;



import com.spring.orm.dao.UserDAO;
import com.spring.orm.entity.User;
import com.spring.orm.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
//标注累是一个service组件
@Transactional
//在service层启动事物
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;

    @Override
    public int insertUser(User user) {
        return userDAO.insert(user);
    }

    @Override
    public int deleteUser(long id) {
        return userDAO.deleteByPrimaryKey(id);
    }

    @Override
    public int updateUser(User user) {
        return userDAO.updateByPrimaryKey(user);
    }

    @Override
    public List<User> selectUsers() {
        return userDAO.selectAll();
    }

    @Override
    public User getUser(long id) {
        return userDAO.selectByPrimaryKey(id);
    }
}
