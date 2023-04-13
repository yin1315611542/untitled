package com.example.jvm.xx;

import com.example.jvm.multdatasource.SourceDetailDO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

import static java.lang.System.out;

/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-03-30 10:10
 **/
@Service
public class XXFastThrow {
   public void outOfMemory(){
       ArrayList<SourceDetailDO> sourceDetailDOS = new ArrayList<>();
       while (true){
           SourceDetailDO sourceDetailDO = new SourceDetailDO();
           sourceDetailDOS.add(sourceDetailDO);
           out.println(sourceDetailDOS.size());
       }
   }
}
