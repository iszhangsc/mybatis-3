package com.source.read;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * <p>
 * mybatis 测试
 * </p>
 *
 * @author zhāngshìchāng
 * @date 2021/4/6 9:58 上午
 */
public class MybatisTests {


    /**
     * 测试
     */
    @Test
    public void test() throws IOException {
        String resource = "com/source/read/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.selectOne(1);
        System.out.println("查询User结果--->" + user);
        sqlSession.close();
    }


}
