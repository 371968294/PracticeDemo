package com.huskey.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * @Author: MiaoJiamin
 * @CreateDate: 2015/9/15 001516:03
 * @Description:
 */

@Entity(name = "T_USER")
public class User {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(length = 32)
    private String id;

    @Column(length = 32)
    private String userName;

    @Column(length = 32)
    private String age;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

}
