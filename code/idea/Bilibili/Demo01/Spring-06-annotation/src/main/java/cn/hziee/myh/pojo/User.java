package cn.hziee.myh.pojo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//将这个类变成一个组件
@Component
public class User {

    // 使用Spring的注解给name赋值 相当于在xml中给bea注入值 常用于简单的值注入 复杂的建议使用xml
    @Value("李四")
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
