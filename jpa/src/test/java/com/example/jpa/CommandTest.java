package com.example.jpa;

import com.example.jpa.command.CommandUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-07-20 11:43
 **/
@SpringBootTest
public class CommandTest {
    @Test
    public void test(){
        CommandUtil.commandExecute2("ls");
    }
}
