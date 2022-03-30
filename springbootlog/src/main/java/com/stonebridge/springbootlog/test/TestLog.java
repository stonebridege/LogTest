package com.stonebridge.springbootlog.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLog {
    Logger logger = LoggerFactory.getLogger(TestLog.class);

    public void test01() {
        /*
            入门案例：
                springboot日志具体实现
                    级别测试
                    默认是info级别
                    logback的风格输出（默认使用的是logback的日志实现）
         */
        logger.error("error信息");
        logger.warn("warn信息");
        logger.info("info信息");
        logger.debug("debug信息");
        logger.trace("trace信息");
    }

}
