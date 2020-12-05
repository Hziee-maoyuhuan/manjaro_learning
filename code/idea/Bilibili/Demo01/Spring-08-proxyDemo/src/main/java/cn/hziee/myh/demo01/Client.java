package cn.hziee.myh.demo01;

// 用房者类
public class Client {
    public static void main(String[] args) {
        Host host = new Host();
        host.rent();        // 调用类方法 相当于直接找房东
    }
}
