package com.huskey.helloworld;

/**
 * @Author: MiaoJiamin
 * @CreateDate: 2015/9/14 001414:50
 * @Description:
 */
public class HelloWorld {
    public String sayHello(){
        return "hello world";
    }

    public static void main (String[] args){
      String result =   new HelloWorld().sayHello();
        System.out.println("result"+result);
    }
}
