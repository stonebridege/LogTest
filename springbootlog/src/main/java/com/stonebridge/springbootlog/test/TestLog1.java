package com.stonebridge.springbootlog.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLog1 {
    public void test06() {
    /*

        由于log4j2性能的强大
        当今市场上越来越多的项目选择使用slf4j+log4j2的组合
        springboot默认使用的是slf4j+logback的组合
        我们可以将默认的logback替换成为log4j2

        1.启动器依赖，间接的依赖logback
            所以需要将之前的环境中，logback的依赖去除掉
        2.添加log4j2依赖
        3.将log4j2的配置文件log4j2.xml导入到类路径resources下面
     */

        Logger logger = LoggerFactory.getLogger(TestLog.class);
        for (int i = 0; i < 2000; i++) {
            logger.error("error信息");
            logger.warn("warn信息");
            logger.info("info信息");
            logger.debug("debug信息");
            logger.trace("trace信息");
        }
    }
}
