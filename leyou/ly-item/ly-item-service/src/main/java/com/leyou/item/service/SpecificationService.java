package com.leyou.item.service;

import com.leyou.common.exception.Enum;
import com.leyou.common.exception.LyException;
import com.leyou.item.mapper.SpecGroupMapper;
import com.leyou.item.pojo.SpecGroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.List;

/**
 * @Author tjy
 * @Date 2020/4/4 16:23
 */
@Service
public class SpecificationService {
    @Autowired
    SpecGroupMapper specGroupMapper;
    public List<SpecGroup> queryGroupBCid(Long cid){
        SpecGroup specGroup = new SpecGroup();
        specGroup.setCid(cid);
        List<SpecGroup> select = specGroupMapper.select(specGroup);
        if(CollectionUtils.isEmpty(select)){
            throw new LyException(Enum.SPEC_GROUP_NOT_FOND);
        }
        return select;

    }
}
