package com.mybatis.test;

import com.mybatis.mapper.EmpMapper;
import com.mybatis.pojo.Emp;
import com.mybatis.pojo.EmpExample;
import com.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MBGTest {
    @Test
    public void testMBG(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);

        /*// 查询所有数据
        List<Emp> emps = mapper.selectByExample(null);
        emps.forEach(emp -> System.out.println(emp));*/

        /*// 根据条件查询
        EmpExample empExample = new EmpExample();
        empExample.createCriteria().andEmpNameEqualTo("张三").andAgeBetween(10,20);
        empExample.or().andDidIsNotNull();
        List<Emp> emps = mapper.selectByExample(empExample);
        emps.forEach(emp -> System.out.println(emp));*/

        mapper.updateByPrimaryKeySelective(new Emp(1, "admin", null, "女", "456@qq.com", 3));
    }


}
