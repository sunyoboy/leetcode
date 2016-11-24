package com.javase.mybatis.dao;

import com.javase.mybatis.entity.Article;
import com.javase.mybatis.entity.User;

import java.util.List;

/**
 * Created by DD240 on 2016/11/24.
 */
public interface UserDao {

    public void insertUser(User user);

    public void deleteUser(int id);

    public void updateUser(User user);

    public User selectUser(int id);

    public List<User> selectUsers(String username);

    public List<Article> getUserArticles(int id);
}
