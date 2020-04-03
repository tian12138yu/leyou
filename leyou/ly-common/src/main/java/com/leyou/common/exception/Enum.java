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
    BRAND_NOT_FOUND(404,"品牌不存在！"),
    CATEGORY_NOT_FOND(404,"商品分类没查到！"),
    BRAND_SAVE_ERROR(500,"新增商品失败！"),
    UPLOAD_FILE_ERROR(500,"文件上传失败！"),
    INVALID_FILE_TYPE(500,"无效的文件类型！"),
    ;
    private int code;
    private String msg;


}
