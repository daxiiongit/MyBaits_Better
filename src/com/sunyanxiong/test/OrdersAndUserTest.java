package com.sunyanxiong.test;

import com.sunyanxiong.entities.Orderdetail;
import com.sunyanxiong.entities.Orders;
import com.sunyanxiong.entities.OrdersCustom;
import com.sunyanxiong.entities.User;
import com.sunyanxiong.mapper.OrdersMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Description: 测试查询订单
 * <p>
 * Created by daxiongit on 2016/5/11 0011.
 */
public class OrdersAndUserTest {

    // 声明回话工厂
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void before(){
        // 定义MyBatis的配置文件
        String resource = "config/SqlMapConfig.xml";
        try {
            // 创建输入流
            InputStream inputStream = Resources.getResourceAsStream(resource);
            // 创建回话工厂
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 测试查询订单信息，关联查询用户信息(resultType)
    @Test
    public void testQueryOrderAndUserResultType(){
        // 创建回话
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 使用sqlSession 来调用mapper代理自动创建实现类
        OrdersMapper ordersMapper = sqlSession.getMapper(OrdersMapper.class);

        // 执行查询操作
        try {
            List<OrdersCustom> list = ordersMapper.findOrdersResultType();
            // 打印
            System.out.println("查询结果：" + list);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 关闭回话
        sqlSession.close();
    }

    // 测试查询订单信息，关联查询用户信息(resultMap)
    @Test
    public void testQueryOrderAndUserResultMap(){
        // 创建回话
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 使用sqlSession 来调用mapper代理自动创建实现类
        OrdersMapper ordersMapper = sqlSession.getMapper(OrdersMapper.class);

        // 执行查询操作
        try {
            List<Orders> list = ordersMapper.findOrdersResultMap();
            // 打印
            System.out.println("查询结果：" + list);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 关闭回话
        sqlSession.close();
    }

    // 测试查询订单信息，关联查询订单详情
    @Test
    public void testFindOrdersAndOrderdetailResultMap(){
        // 创建回话
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 使用sqlSession 来调用mapper代理自动创建实现类
        OrdersMapper ordersMapper = sqlSession.getMapper(OrdersMapper.class);

        // 执行查询操作
        try {
            List<Orderdetail> list = ordersMapper.findOrdersAndOrderdetailResultMap();
            // 打印
            System.out.println("查询结果：" + list);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 关闭回话
        sqlSession.close();
    }

    // 测试查询订单信息，关联查询订单详情
    @Test
    public void testFindUserAndItems(){
        // 创建回话
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 使用sqlSession 来调用mapper代理自动创建实现类
        OrdersMapper ordersMapper = sqlSession.getMapper(OrdersMapper.class);

        // 执行查询操作
        try {
            List<User> list = ordersMapper.findUserAndItems();
            // 打印
            System.out.println("查询结果：" + list);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 关闭回话
        sqlSession.close();
    }

    // 测试根据id查询用户信息
    @Test
    public void testFindUserById(){
        // 创建回话
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 使用sqlSession 来调用mapper代理自动创建实现类
        OrdersMapper ordersMapper = sqlSession.getMapper(OrdersMapper.class);

        // 执行查询操作
        try {
            User user = ordersMapper.findUserById(1);
            // 打印
            System.out.println("查询结果：" + user);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 关闭回话
        sqlSession.close();
    }

    // 延迟加载测试
    @Test
    public void testFindOrdersLoadingLazy(){
        // 创建回话
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 使用sqlSession 来调用mapper代理自动创建实现类
        OrdersMapper ordersMapper = sqlSession.getMapper(OrdersMapper.class);

        // 执行查询操作
        try {
            List<Orders> list = ordersMapper.findOrdersLoadingLazy();
            // 打印
            System.out.println("查询结果：" + list);

            // 遍历list
            for (Orders orders : list){
                System.out.println(orders.getUser());
            }

            // 调用list.getUser()方法，可以调用延迟加载
            System.out.println();

        } catch (Exception e) {
            e.printStackTrace();
        }

        // 关闭回话
        sqlSession.close();
    }

}
