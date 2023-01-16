package com.yinhd.designpattern.one.interfacedemo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class ApplicationTest {
    @Resource
    private Application applicationUnderTest;

    @Test
    void testHandleRpcRequest() {
        applicationUnderTest.handleRpcRequest("rpc");
    }
}
