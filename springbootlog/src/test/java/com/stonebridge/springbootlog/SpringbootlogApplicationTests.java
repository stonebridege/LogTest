package com.stonebridge.springbootlog;

import com.stonebridge.springbootlog.test.TestLog;
import com.stonebridge.springbootlog.test.TestLog1;
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

    @Test
    void test3() {
        TestLog testLog = new TestLog();
        testLog.test03();
    }

    @Test
    void test5() {
        TestLog1 testLog = new TestLog1();
        testLog.test06();
    }

}
