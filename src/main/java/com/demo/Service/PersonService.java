package com.demo.Service;

import com.demo.bean.Person;
import com.demo.dao.PersonMapper;
import com.alibaba.fastjson.JSON;
import gaohao.springboot.mybatis.pagetool.PageHelper;
import gaohao.springboot.mybatis.pagetool.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author xiemingjie
 * @version 1.0.0
 * @Type ${TYPE_NAME}
 * @Desc
 * @Date 2017/8/17
 */
@Component
public class PersonService {

    @Autowired
    private PersonMapper personMapper;


    public void page(){
        PageInfo<Person> pageInfo=PageHelper.startPage(1,2,()->{
            personMapper.queryList();
        });
        System.out.println(JSON.toJSONString(pageInfo));
//        Example exam=new Example(Person.class);
//        System.out.println(JSON.toJSON(exam.getSelectColumns()));

    }

}
