package com.stonebridge.slf4j;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Slf4jDemo1 {

    public void test09() {

        /*

            需求：
                假设我们项目一直以来使用的是log4j日志框架
                但是随着技术和需求的更新换代
                log4j已然不能够满足我们系统的需求
                我们现在就需要将系统中的日志实现重构为 slf4j+logback的组合
                在不触碰java源代码的情况下，将这个问题给解决掉

                首先将所有关于其他日志实现和门面依赖全部去除
                仅仅只留下log4j的依赖
                测试的过程中，只能使用log4j相关的组件

                此时需要将日志替换为slf4j+logback
                我们既然不用log4j了，就将log4j去除
                将slf4j日志门面和logback的日志实现依赖加入进来
                这样做，没有了log4j环境的支持，编译报错

                这个时候就需要使用桥接器来做这个需求了
                桥接器解决的是项目中日志的重构问题，当前系统中存在之前的日志API，可以通过桥接转换到slf4j的实现

                桥接器的使用步骤：
                1.去除之前旧的日志框架依赖
                    <dependency>
                        <groupId>log4j</groupId>
                        <artifactId>log4j</artifactId>
                        <version>1.2.17</version>
                    </dependency>
                2.添加slf4j提供的桥接组件
                    log4j相关的桥接器
                    <dependency>
                        <groupId>org.slf4j</groupId>
                        <artifactId>log4j-over-slf4j</artifactId>
                        <version>1.7.25</version>
                    </dependency>
                  桥接器加入后，代码编译就不报错了
                  测试：
                    日志信息输出
                    输出格式为logback
                    证明了现在使用的确实是slf4j门面+logback实现

                    在重构之后，就会为我们造成这样一种假象
                    使用的明明是log4j包下的日志组件资源
                    但是真正日志的实现，却是使用slf4j门面+logback实现
                    这就是桥接器给我们带来的效果

                  注意：
                      在桥接器加入之后，适配器就没有必要加入了
                      桥接器和适配器不能同时导入依赖
                      桥接器如果配置在适配器的上方，则运行报错，不同同时出现
                      桥接器如果配置在适配器的下方，则不会执行桥接器，没有任何的意义


         */
        Logger logger = LogManager.getLogger(Slf4jDemo1.class);
        logger.info("info信息");
    }

    public void test10() {

        /*

            在配置了桥接器之后，底层就是使用slf4j实现的日志
            分析其中原理

            通过getLogger
            进入Log4jLoggerFactory
            Logger newInstance = new Logger(name); 新建logger对象

            进入构造方法
            protected Logger(String name) {
                super(name);
            }

            点击进入父类的构造方法
            Category(String name) {
                this.name = name;
                this.slf4jLogger = LoggerFactory.getLogger(name);
                if (this.slf4jLogger instanceof LocationAwareLogger) {
                    this.locationAwareLogger = (LocationAwareLogger)this.slf4jLogger;
                }
            }

            在这个Category构造方法中，核心代码
                this.slf4jLogger = LoggerFactory.getLogger(name);

            LoggerFactory来自于org.slf4j

         */
        Logger logger = LogManager.getLogger(Slf4jDemo1.class);
    }
}
