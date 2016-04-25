package com.huskey.helloword;

import com.huskey.dao.IBaseDao;
import com.huskey.dao.INewsDao;
import com.huskey.dao.impl.BaseDao;
import com.huskey.dao.impl.NewsDao;
import com.huskey.model.News;
import com.huskey.service.INewsService;
import com.huskey.service.IPersonService;
import org.apache.log4j.Logger;
import org.hibernate.Transaction;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.transaction.Transactional;


/**
 * @Author: MiaoJiamin
 * @CreateDate: 2015/9/14 001415:02
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring*.xml"})
public class HelloWorldTest extends AbstractTransactionalJUnit4SpringContextTests {

    @Autowired
    private INewsService iNewsService;

    @Autowired
    private IPersonService iPersonService;

    @Test
    public void testSayHello() {
        iPersonService.savePerson();
    }


}
