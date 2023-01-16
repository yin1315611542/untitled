package com.yinhd.designpattern.one.abstrademo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * @program: designpatterns
 * @description:
 * @Author: yinhd
 * @create: 2023-01-16 14:40
 **/
public class FileLogger extends Logger{
    private final Writer fileWriter;
    public FileLogger(String name, boolean enabled, Level minPermittedLevel,String filepath) throws IOException {
        super(name, enabled, minPermittedLevel);
        this.fileWriter = new FileWriter(filepath);
    }

    @Override
    protected void doLog(Level level, String message) throws IOException {
        fileWriter.write("...");
        System.out.println("输出到文件");
    }
}
