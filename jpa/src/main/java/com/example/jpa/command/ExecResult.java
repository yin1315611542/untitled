package com.example.jpa.command;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-07-20 11:32
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExecResult {
    Integer code;
    String message;
    Integer lineNumber;
}