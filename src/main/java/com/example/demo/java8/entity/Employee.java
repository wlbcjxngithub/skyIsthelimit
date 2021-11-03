package com.example.demo.java8.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author : wanglibin-v
 * @Date : 2021/11/1
 * @Version : 1.0
 * @Description : 员工类实体
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee implements Serializable {

    private String name;

    private Integer age;

    private Double salary;
}
