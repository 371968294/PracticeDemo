package com.huskey.dao.impl;

import com.huskey.dao.INewsDao;
import com.huskey.model.News;
import org.springframework.stereotype.Repository;

/**
 * Created by Husky on 16/4/20.
 */
@Repository
public class NewsDao extends BaseDao<News, Integer> implements INewsDao {
}
