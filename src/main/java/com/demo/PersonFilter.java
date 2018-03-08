package com.demo;

import com.alibaba.druid.filter.FilterEventAdapter;
import com.alibaba.druid.proxy.jdbc.StatementProxy;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @author xiemingjie
 * @version 1.0.0
 * @Type ${TYPE_NAME}
 * @Desc
 * @Date 2018/3/8
 */
public class PersonFilter extends FilterEventAdapter {

    @Override
    protected void statementExecuteBefore(StatementProxy statement, String sql) {
        System.out.println("+++++++beforesql:"+sql);
        super.statementExecuteBefore(statement, sql);
    }
    @Override
    protected void statementExecuteAfter(StatementProxy statement, String sql, boolean result) {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
                .getRequest();
        System.out.println(request.getRequestURI());
        System.out.println("+++++++aftersql:"+sql);
        super.statementExecuteAfter(statement, sql,result);
    }
}
