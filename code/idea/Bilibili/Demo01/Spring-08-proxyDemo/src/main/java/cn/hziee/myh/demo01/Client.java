package cn.hziee.myh.demo01;

// 用房者类
public class Client {
    public static void main(String[] args) {
        // 新建一个房东的角色
        Host host = new Host();

//        第一种方法: 直接找房东租房子
//        host.rent();        // 调用类方法 相当于直接找房东

//        第二种方法: 寻找代理 调用代理的方法,实现租房
        Proxy proxy = new Proxy(host);
        proxy.rent();       // 调用中介(代理)的方法实现 本质还是房东出租房子


    }
}
