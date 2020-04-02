package com.leyou.item.service;

import com.leyou.common.exception.Enum;
import com.leyou.common.exception.LyException;
import com.leyou.item.mapper.CategoryMapper;
import com.leyou.item.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author tjy
 * @Date 2020/4/1 19:13
 */
@Service
public class CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;

    public List<Category> queryCategoryListByPid(Long pid) {
        Category category = new Category();
        category.setParentId(pid);
        List<Category> select = categoryMapper.select(category);
        if(select.isEmpty()){
            throw new LyException(Enum.CATEGORY_NOT_FOND);
        }
        return select;
    }
}
