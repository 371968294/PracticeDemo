package com.huskey.model;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

/**
 * @Author: MiaoJiamin
 * @CreateDate: 2015/9/17 001717:26
 * @Description:
 */
public class ValidateModel {
    @NotEmpty(message="{name.not.empty}")
    private String name;

    @Range(min=0, max=150,message="123")
    private String age;

    @NotEmpty(message="123")
    @Email(message="123")
    private String email;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
