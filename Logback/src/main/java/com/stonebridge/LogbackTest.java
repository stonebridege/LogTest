package com.stonebridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogbackTest {
    public void test01(){

        /*

            入门案例
                logback有5种级别的日志输出
                分别是
                trace < debug < info < warn < error

                通过信息打印，默认的日志级别是debug，trace信息没有打印出来

         */
        Logger logger = LoggerFactory.getLogger(LogbackTest.class);

        logger.error("error信息");
        logger.warn("warn信息");
        logger.info("info信息");
        logger.debug("debug信息");
        logger.trace("trace信息");

    }
}
