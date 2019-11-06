package cn.besbing.test;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class DataSourceTests {

    @Autowired
    //ApplicationContext applicationContext;
    private TestRestTemplate restTemplate;

    @Test
    public  void testDataSource(){
        String result = restTemplate.getForObject("/hello",String.class);
        assertEquals("helloworld",result);
    }
}
