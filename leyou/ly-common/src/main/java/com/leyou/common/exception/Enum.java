package com.leyou.common.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @Author tjy
 * @Date 2020/4/1 15:18
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
public enum  Enum {
    PRICE_CANNOT_BE_NULL(400,"价格不能为空！"),
    CATEGORY_NOT_FOND(404,"商品分类没查到！"),
    ;
    private int code;
    private String msg;


}
