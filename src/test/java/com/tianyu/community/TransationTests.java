package com.tianyu.community;

import com.tianyu.community.service.AlphaService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class TransationTests {

    @Autowired
    private AlphaService alphaService;

    @Test
    public void testSave(){
        Object save = alphaService.save();
        System.out.println(save);
    }

    @Test
    public void testSave2(){
        Object save = alphaService.save2();
        System.out.println(save);
    }
}
