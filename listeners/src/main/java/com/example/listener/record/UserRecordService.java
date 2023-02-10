package com.example.listener.record;

import com.example.listener.user.UserEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-02-08 10:01
 **/
@Service
@RequiredArgsConstructor
public class UserRecordService {

    private final RecordRepository recordRepository;

    @EventListener
    public void addRecord(UserEvent userEvent){
        UserRecord userRecord = new UserRecord();
        userRecord.setOperatingContent("user被创建了");
        userRecord.setCreateDate(LocalDateTime.now());
        recordRepository.save(userRecord);
    }

}
