package com.example.redis_demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.SetOperations;
import org.springframework.data.redis.core.ZSetOperations;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ClassName：RedisTest.java
 * @Description:
 * @Date: 2020/6/17 5:13 PM
 * @Author: lin.guo
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = RedisDemoApplication.class)
public class RedisTest {

    @Autowired
    private RedisTemplate redisTemplate;

    /**
     * 1、字符串
     * 2、hash
     * 3、列表
     * 4、set
     * 5、zset
     * 参考文章：https://www.jianshu.com/p/7bf5dc61ca06
     * https://blog.csdn.net/ruby_one/article/details/79141940
     * <p>
     * redisTemplate.opsForValue();//操作字符串
     * redisTemplate.opsForHash();//操作hash
     * redisTemplate.opsForList();//操作list
     * redisTemplate.opsForSet();//操作set
     * redisTemplate.opsForZSet();//操作有序set
     */

    @Test
    public void stringTest() {
        redisTemplate.opsForValue().set("key1", "value1");
        redisTemplate.opsForValue().set("key2", "value2");
        System.out.println(redisTemplate.opsForValue().get("key2"));
    }

    @Test
    public void listTest() {
        redisTemplate.opsForList().leftPush("list1", "value1");
        redisTemplate.opsForList().leftPush("list1", "value2");
        System.out.println(redisTemplate.opsForList().rightPop("list1"));
    }

    @Test
    public void hashTest() {
        redisTemplate.opsForHash().put("hash1", "hashkey1", "hashvalue1");
        redisTemplate.opsForHash().put("hash1", "hashkey2", "hashvalue2");
        redisTemplate.opsForHash().put("hash1", "hashkey3", "hashvalue3");
        System.out.println(redisTemplate.opsForHash().entries("hash1"));
        redisTemplate.opsForHash().delete("hash1", "hashkey3");
        System.out.println(redisTemplate.opsForHash().entries("hash1"));
        redisTemplate.opsForHash().size("hash1");
    }

    @Test
    public void setTest() {
        SetOperations ops = redisTemplate.opsForSet();
        String[] strings = {"setvalue1","setvalue2","setvaule3"};
        ops.add("set1",strings);
        System.out.println(ops.size("set1"));
        System.out.println(ops.members("set1"));
    }

    @Test
    public void zsetTest() {
        ZSetOperations zops = redisTemplate.opsForZSet();
        zops.add("zset1","value1",1.1);
        zops.add("zset1","value2",1.2);
        zops.add("zset1","value3",3);
        System.out.println(zops.range("zset1",1,2));

    }

}
