package com.dr.mybatisplusdemo;

import com.dr.mybatisplusdemo.entity.Myuser;
import com.dr.mybatisplusdemo.mapper.MyuserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisPlusDemoApplicationTests {
    @Autowired
    private MyuserMapper myuserMapper;

    @Test
    void contextLoads() {
//        Myuser myuser = new Myuser();
//        myuser.setId(11);
//        myuser.setUsername("11");
        List<Myuser> getall = myuserMapper.getall();
        System.out.println(getall.get(0));
    }


}
