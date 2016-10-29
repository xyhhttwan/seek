package com.seek.soft;

/**
 * 用户的相关接口
 */
public interface IUser {

    /**
     * 新增用户信息
     *
     * @param users
     * @return int
     */
    int insertUser(Users users);

    /**
     * 修改用户信息
     *
     * @param users
     * @return int
     */
    int modifyUser(Users users);



}
