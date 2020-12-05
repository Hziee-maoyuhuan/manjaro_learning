package cn.hziee.myh.pojo;

public class User {

    private String name;

//    默认有一个无参构造函数 这里不讨论
    public User(){
        System.out.println("创建了User,调用了User无参构造函数..");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void show() {
        System.out.println("name--" + name);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
