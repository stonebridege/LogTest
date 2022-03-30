package com.stonebridge.springbootlog;

import com.stonebridge.springbootlog.test.TestLog;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootlogApplicationTests {

    @Test
    void contextLoads() {
        System.out.println("111111111");
    }

    @Test
    void test1() {
        TestLog testLog = new TestLog();
        testLog.test01();
    }

    @Test
    void test2() {
        TestLog testLog = new TestLog();
        testLog.test02();
    }

}
