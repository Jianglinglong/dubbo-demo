package jiang.demo.mapper;

import jiang.demo.service.model.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    public User findUserById(@Param("userId") int userId);

    public User findUserByName(@Param("userName") String userName);
}
