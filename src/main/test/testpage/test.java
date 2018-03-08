package testpage;

import abc.aaa.Service.PersonService;
import abc.aaa.base.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author xiemingjie
 * @version 1.0.0
 * @Type ${TYPE_NAME}
 * @Desc
 * @Date 2017/8/17
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class test {

    @Autowired
    private PersonService personService;

    @Test
    public void test1(){
        personService.page();
    }

}
