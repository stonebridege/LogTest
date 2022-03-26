package com.stonebridge.slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jDemo {

    public void test01() {

    /*
    SLF4J对日志的级别划分
    trace、debug、info、warn、error五个级别
    trace：日志追踪信息
    debug：日志详细信息
    info：日志的关键信息,默认打印级别
    warn：日志警告信息
    error：日志错误信息

    在没有任何其他日志实现框架集成的基础之上
    slf4j使用的就是自带的框架slf4j-simple
    slf4j-simple也必须以单独依赖的形式导入进来
    */
        Logger logger = LoggerFactory.getLogger(Slf4jDemo.class);
        logger.trace("trace信息");
        logger.debug("debug信息");
        logger.info("info信息");
        logger.warn("warn信息");
        logger.error("error信息");
    }

    public void test02() {

        /*

        我们输出动态的信息时
          也可以使用占位符的形式来代替字符串的拼接

        我们有些时候输出的日志信息，需要我们搭配动态的数据
        有可能是信息，有可能是数据库表中的数据
                总之我们这样做最大的好处就是能够让日志打印变得更加灵活
        如果是通过拼接字符串的形式，不仅麻烦，而且更重要的是可读性查
                我们的日志打印是支持以替代符的形式做日志信息拼接的
        一般情况下，几乎所有的日志实现产品，都会提供这种基础功能
                */
        Logger logger = LoggerFactory.getLogger(Slf4jDemo.class);
        String name = "张三";
        int age = 23;
        //logger.info("学生信息-姓名："+name+"；年龄："+age);
        logger.info("学生信息-姓名：{}，年龄：{}",new Object[]{name,age});
        logger.info("学生信息-姓名：{}，年龄：{}", name, age);
    }
}
