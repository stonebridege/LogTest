package com.stonebridge;


//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Log4j2Test {
    Logger logger = LoggerFactory.getLogger(Log4j2Test.class);

    public void test01() {
 /*

            入门案例
                单纯的使用Log4j2的 门面+实现
                Log4j2和log4j提供了相同的日志级别输出
                默认为error级别信息的打印

                ERROR StatusLogger No Log4j 2 configuration file found. Using default configuration
                表示我们还没有建立自己的配置文件
                如果没有建立配置文件，则使用默认的配置
         */
//        Logger logger = LogManager.getLogger(Log4j2Test.class);
//
//        logger.fatal("fatal信息");
//        logger.error("error信息");
//        logger.warn("warn信息");
//        logger.info("info信息");
//        logger.debug("debug信息");
//        logger.trace("trace信息");
    }

    public void test02() {

        /*
            使用配置文件
            log4j2是参考logback创作出来的，所以配置文件也是使用xml
            log4j2同样是默认加载类路径（resources）下的log4j2.xml文件中的配置

            根标签，所有日志相关信息，都是在根标签中进行配置
            <Configuration status="debug" monitorInterval="数值"></Configuration>
            在根标签中，可以加属性
            status="debug" 日志框架本身的日志输出级别
            monitorInterval="5" 自动加载配置文件的间隔时间，不低于5秒
         */
//        Logger logger = LogManager.getLogger(Log4j2Test.class);
//        logger.fatal("fatal信息");
//        logger.error("error信息");
//        logger.warn("warn信息");
//        logger.info("info信息");
//        logger.debug("debug信息");
//        logger.trace("trace信息");
    }


    public void test03() {

        /*

            虽然log4j2也是日志门面，但是现在市场的主流趋势仍然是slf4j
            所以我们仍然需要使用slf4j作为日志门面，搭配log4j2强大的日志实现功能，进行日志的相关操作

            接下来我们配置的就是当今市场上的最强大，最主流的日志使用搭配方式：
            slf4j+log4j2

            1.导入slf4j的日志门面
            2.导入log4j2的适配器
            3.导入log4j2的日志门面
            4.导入log4j2的日志实现
         */
        logger.error("error信息");
        logger.warn("warn信息");
        logger.info("info信息");
        logger.debug("debug信息");
        logger.trace("trace信息");
    }

    public void test04() {
        /*
            将日志输出到文件中
         */
        Logger logger = LoggerFactory.getLogger(Log4j2Test.class);
        logger.error("error信息");
        logger.warn("warn信息");
        logger.info("info信息");
        logger.debug("debug信息");
        logger.trace("trace信息");
    }

    public void test05() {
        /*
            日志的拆分
         */
        Logger logger = LoggerFactory.getLogger(Log4j2Test.class);
        for (int i = 0; i < 2000; i++) {
            logger.error("error信息");
            logger.warn("warn信息");
            logger.info("info信息");
            logger.debug("debug信息");
            logger.trace("trace信息");
        }
    }

public void test06() {

    /*
        异步日志实现（单独分配线程做日志的记录）
            方式1：使用AsyncAppender的方式

            1.添加异步日志依赖
            2.在Appenders标签中，对于异步进行配置
                使用Async标签
            3.rootlogger引用Async
     */
    //日志的记录
    for (int i = 0; i < 500; i++) {
        logger.error("error信息");
        logger.warn("warn信息");
        logger.info("info信息");
        logger.debug("debug信息");
        logger.trace("trace信息");
    }

    //系统业务逻辑
    for (int i = 0; i < 100; i++) {
        System.out.println("------------------");
    }
}
}
