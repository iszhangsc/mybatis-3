package com.iszhangsc;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * <p>
 * 测试
 * </p>
 *
 * @author zhāngshìchāng
 * @date 2020/10/12 10:08 上午
 */
public class UserTests {


  @Test
  public void userListTests() throws IOException {
    // 加载mybatis主配置文件.
    InputStream inputStream = Resources.getResourceAsStream("com/iszhangsc/mybatis-config.xml");
    // 通过构建器(SqlSessionFactoryBuilder) 构建一个 SqlSessionFactory工厂对象
    SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    // 通过SqlSessionFactory打开回话
    SqlSession sqlSession = sessionFactory.openSession();
    UserMapper mapper = sqlSession.getMapper(UserMapper.class);
    List<User> users = mapper.userList(1);
//    sqlSession.commit();
    UserMapper mapper2 = sqlSession.getMapper(UserMapper.class);
    List<User> users2 = mapper2.userList(2);
    System.out.println(users);
  }

}
