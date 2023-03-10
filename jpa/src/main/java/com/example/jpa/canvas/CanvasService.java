package com.example.jpa.canvas;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-02-11 16:26
 **/
@Component
@RequiredArgsConstructor
public class CanvasService {
    private final CanvasRepository canvasRepository;


    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void createCanvas(String number){
        Canvas canvas = new Canvas();
        canvas.setContent(number);
        canvasRepository.save(canvas);
    }
}
