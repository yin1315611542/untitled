package com.example.jvm;

import com.example.jvm.controller.XXController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class JvmApplicationTests {
    @Autowired
    XXController xxController;
    @Test
    public  void contextLoads() {
        xxController.FastThrow();
    }

}
