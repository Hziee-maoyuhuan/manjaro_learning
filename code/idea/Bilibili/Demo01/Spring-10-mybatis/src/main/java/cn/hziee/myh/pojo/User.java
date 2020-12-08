package cn.hziee.myh.pojo;

import lombok.Data;

@Data
public class User {

    private int id;
    private String name;
    private String password;

//    因为配置了@Data 所以不需要写getter和setter了

}
