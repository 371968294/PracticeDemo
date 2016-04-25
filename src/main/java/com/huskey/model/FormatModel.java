package com.huskey.model;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import java.util.Date;

/**
 * @Author: MiaoJiamin
 * @CreateDate: 2015/9/18 001813:56
 * @Description:
 */
public class FormatModel {
    @NumberFormat(style = NumberFormat.Style.CURRENCY)
    private double money;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date date;

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
