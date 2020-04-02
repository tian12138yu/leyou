package com.leyou.common.exception;

import com.leyou.common.vo.ExceptionResult;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @Author tjy
 * @Date 2020/4/1 15:03
 */
@ControllerAdvice
public class ExceptionHandle {
    @ExceptionHandler(LyException.class)
    public ResponseEntity<ExceptionResult> handleException(LyException e){

        return ResponseEntity.status(e.getAnEnum().getCode())
                .body(new ExceptionResult(e.getAnEnum())) ;

    }
}
