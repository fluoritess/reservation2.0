package com.shan.reservation.service;

import com.shan.reservation.bean.user;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
/**
 * @author wsw
 * @Package com.shan.reservation.service
 * @Description:
 * @date 2019年12月30日 19:25:31
 */
@Service
public interface UserService {
    //根据昵称查询用户
    user selectUserByNickName(String nickname);
    //根据id查询用户
    user selectUserById(int userid);
    //更新最近登录时间
    void updateByName(String userName,Date lastDate, Date thisDate);
    //查询所有用户
    List<user> selectAllUser();
    //添加评价
    void UserEvaluation(String no,double score,String content);
    //查询上次登陆时间
    user selectLastDate(String userName);
    //注册用户
    int register(user user);
}
