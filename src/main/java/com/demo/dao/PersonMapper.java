package com.demo.dao;

import com.demo.bean.Person;

import java.util.List;

/**
 * @author xiemingjie
 * @version 1.0.0
 * @Type ${TYPE_NAME}
 * @Desc
 * @Date 2017/8/17
 */
public interface PersonMapper {
    List<Person>  queryList();
}
