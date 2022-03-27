package com.stonebridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogbackTest {
    public void test01() {
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

    public void test02() {
        /*
            Logback配置文件的使用
                在resources下面，创建一份配置文件，命名为logback.xml
                一切配置都是在根标签中进行操作的
                <configuration>
                </configuration>
         */
        Logger logger = LoggerFactory.getLogger(LogbackTest.class);
        logger.error("error信息");
        logger.warn("warn信息");
        logger.info("info信息");
        logger.debug("debug信息");
        logger.trace("trace信息");
    }

    public void test03() {
        /*
            在实际的生产环境中，我们更希望将日志信息保留在文件中
            在文件中，默认是以追加日志的形式做记录
         */
        Logger logger = LoggerFactory.getLogger(LogbackTest.class);
        logger.error("error信息");
        logger.warn("warn信息");
        logger.info("info信息");
        logger.debug("debug信息");
        logger.trace("trace信息");
    }

    public void test04() {

        /*
            将日志输出成为一个html文件
                这个html文件是由logback来帮我们控制样式以及输出的格式
                内容由我们自己来指定
                初始测试：样式不是很好看，需要将换行，空格都去除掉
                在实际生产环境中，如果日志不是很多，建议使用html的方式去进行日志的记录
         */
        Logger logger = LoggerFactory.getLogger(LogbackTest.class);
        logger.error("error信息");
        logger.warn("warn信息");
        logger.info("info信息");
        logger.debug("debug信息");
        logger.trace("trace信息");
    }
}
