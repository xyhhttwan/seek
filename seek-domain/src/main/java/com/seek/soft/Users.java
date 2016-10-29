package com.seek.soft;

import java.io.Serializable;

/**
 * 用户相关实体类
 */
public class Users implements Serializable {

    private String id;

    private String phoneNum;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Users users = (Users) o;

        if (!id.equals(users.id)) return false;
        return phoneNum.equals(users.phoneNum);

    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + phoneNum.hashCode();
        return result;
    }


}
