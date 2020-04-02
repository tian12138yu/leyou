package com.leyou.common.vo;

import com.leyou.common.exception.Enum;
import lombok.Data;

/**
 * @Author tjy
 * @Date 2020/4/1 15:34
 */
@Data
public class ExceptionResult {
    private int status;
    private String message;
    private Long timestamp;

    public ExceptionResult(Enum em){
        this.status=em.getCode();
        this.message=em.getMsg();
        timestamp=System.currentTimeMillis();
    }
}
