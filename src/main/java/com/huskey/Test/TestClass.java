package com.huskey.Test;

import com.huskey.dao.INewsDao;
import com.huskey.model.News;
import com.huskey.service.IPersonService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Husky on 16/4/20.
 */
public class TestClass {
    private Logger logger = Logger.getLogger(this.getClass());

    @Autowired
    private INewsDao iNewsDao;


}
