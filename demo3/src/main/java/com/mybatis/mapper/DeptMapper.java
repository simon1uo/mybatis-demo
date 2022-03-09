package com.mybatis.mapper;

import com.mybatis.pojo.Dept;
import org.apache.ibatis.annotations.Param;

public interface DeptMapper {

    /**
     * 分布查询部门信息
     * @param did
     * @return
     */
    Dept getEmpAndDeptByStepTwo(@Param("did") Integer did);

    /**
     * 获取部门以及部门中的所有的员工信息
     * @param did
     * @return
     */
    Dept getDeptAndEmp(@Param("did") Integer did);


    /**
     * 通过分布查询查询部门以及部门中的所有员工信息
     */
    Dept getDeptAndEmpByStepOne(@Param("did") Integer did);
}
