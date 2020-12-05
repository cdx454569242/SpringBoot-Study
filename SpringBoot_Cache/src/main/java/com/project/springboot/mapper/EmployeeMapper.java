package com.project.springboot.mapper;


import com.project.springboot.bean.Department;
import com.project.springboot.bean.Employee;
import org.apache.ibatis.annotations.*;

@Mapper
public interface EmployeeMapper {

    @Select("select * from employee where id=#{id}")
    public Employee getEmpById(Integer id);

    @Update("update employee set lastName=(#{lastName},email=#{email},gender=#{gender},d_id=#{dId} where id=#{id})")
    public void updateEmp(Employee employee);

    @Delete("delete from employee where id=#{id}")
    public int deleteEmpById(Integer id);

    @Insert("insert into employee(lastName,email,gender,d_id) values(#{lastName},#{email},#{gender},#{dId})")
    public int insertEmp(Employee employee);
}
