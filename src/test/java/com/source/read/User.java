package com.source.read;

import java.util.Date;

/**
 * <p>
 *
 * </p>
 *
 * @author zhāngshìchāng
 * @date 2021/4/6 10:14 上午
 */
public class User {

    private Integer id;
    private String name;
    private Date birthday;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }

}
