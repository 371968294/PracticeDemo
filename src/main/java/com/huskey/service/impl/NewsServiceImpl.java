package com.huskey.service.impl;

import com.huskey.dao.INewsDao;
import com.huskey.model.News;
import com.huskey.model.Season;
import com.huskey.service.INewsService;
import org.apache.log4j.Logger;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by Husky on 16/4/21.
 */
@Service
public class NewsServiceImpl implements INewsService {
    private Logger logger = Logger.getLogger(this.getClass());

    @Autowired
    private INewsDao iNewsDao;

    public void updateNEWS() {
        News news = iNewsDao.get(6);
        news.setContent("123");
        iNewsDao.getSession().flush();
    }

    @Override
    public void saveNews() {
        News news = new News();
        news.setContent("123");
        news.setTitle("234");
        news.setSeason(Season.冬季);
        iNewsDao.save(news);
    }
}
