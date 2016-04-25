package com.huskey.service.impl;

import com.huskey.dao.IBaseDao;
import com.huskey.model.Person;
import com.huskey.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Husky on 16/4/23.
 */
@Service
public class PersonServiceImpl implements IPersonService {
    @Autowired
    private IBaseDao baseDao;

    @Override
    public void savePerson() {
        Person person = new Person();
        person.setAge(20);
        person.setName("Husky");
        person.getSchools().add("初中");
        person.getSchools().add("小学");
        person.getSchools().add("大学");
        baseDao.save(person);
    }
}
