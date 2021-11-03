package com.example.demo.java8;

import com.example.demo.java8.entity.Employee;

import java.util.Arrays;
import java.util.List;

/**
 * @Author : wanglibin-v
 * @Date : 2021/11/1
 * @Version : 1.0
 * @Description : 测试1
 */
public class Test1 {

    protected List<Employee> employees = Arrays.asList(
            new Employee("张三", 18, 9999.99),
            new Employee("李四", 38, 5555.55),
            new Employee("王五", 60, 6666.66),
            new Employee("赵六", 16, 7777.77),
            new Employee("田七", 18, 3333.33)
    );

}
