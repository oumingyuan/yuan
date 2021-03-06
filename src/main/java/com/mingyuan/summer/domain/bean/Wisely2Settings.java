package com.mingyuan.summer.domain.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@PropertySource("classpath:config/wisely.properties")//注意路径
public class Wisely2Settings {

    @Value("${wisely2.name}")
    private String name;

    @Value("${wisely2.gender}")
    private String gender;

    @Value("${wisely2.age}")
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
