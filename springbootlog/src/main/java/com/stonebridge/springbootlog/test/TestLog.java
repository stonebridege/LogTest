package com.stonebridge.springbootlog.test;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLog {
//    Logger logger = LoggerFactory.getLogger(TestLog.class);

    public void test01() {
//        /*
//            入门案例：
//                springboot日志具体实现
//                    级别测试
//                    默认是info级别
//                    logback的风格输出（默认使用的是logback的日志实现）
//         */
//        logger.error("error信息");
//        logger.warn("warn信息");
//        logger.info("info信息");
//        logger.debug("debug信息");
//        logger.trace("trace信息");
    }

    public void test02() {
//        /*
//        桥接的作用：相当于之前使用的是log4j2，实际底层仍然是slf4j+logback，证明桥接器是起作用的。
//         */
//        Logger logger = LogManager.getLogger(TestLog.class);
//        logger.error("error信息");
//        logger.warn("warn信息");
//        logger.info("info信息");
//        logger.debug("debug信息");
//        logger.trace("trace信息");
    }

    public void test03() {
        /*
            application.properties（yml）是springboot的核心配置文件（用来简化开发使用）我们也可以通过该配置文件，修改日志相关的配置（简单）。
         */
        Logger logger = LoggerFactory.getLogger(TestLog.class);
        logger.error("error信息");
        logger.warn("warn信息");
        logger.info("info信息");
        logger.debug("debug信息");
        logger.trace("trace信息");
    }
}
