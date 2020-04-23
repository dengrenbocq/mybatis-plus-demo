package com.dr.mybatisplusdemo.service.impl;

import com.dr.mybatisplusdemo.entity.Myuser;
import com.dr.mybatisplusdemo.mapper.MyuserMapper;
import com.dr.mybatisplusdemo.service.IMyuserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob
 * @since 2020-04-23
 */
@Service
public class MyuserServiceImpl extends ServiceImpl<MyuserMapper, Myuser> implements IMyuserService {

}
