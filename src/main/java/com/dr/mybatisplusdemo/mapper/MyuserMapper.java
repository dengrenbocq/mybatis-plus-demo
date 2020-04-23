package com.dr.mybatisplusdemo.mapper;

import com.dr.mybatisplusdemo.entity.Myuser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author jobob
 * @since 2020-04-23
 */
@Mapper
public interface MyuserMapper extends BaseMapper<Myuser> {

    public List<Myuser> getall();
}
