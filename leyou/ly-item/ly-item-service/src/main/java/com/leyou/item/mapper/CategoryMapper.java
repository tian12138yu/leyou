package com.leyou.item.mapper;

import com.leyou.item.pojo.Category;
import tk.mybatis.mapper.additional.idlist.IdListMapper;
import tk.mybatis.mapper.common.Mapper;


/**
 * @Author tjy
 * @Date 2020/4/1 19:06
 */

@org.apache.ibatis.annotations.Mapper
public interface CategoryMapper extends Mapper<Category>, IdListMapper<Category,Long> {


}
