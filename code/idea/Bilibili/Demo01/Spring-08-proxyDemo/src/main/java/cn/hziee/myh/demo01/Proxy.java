package cn.hziee.myh.demo01;


// 代理角色 需要代理房东
public class Proxy {

    private Host host;

    public Proxy() {

    }

    public Proxy(Host host) {
        this.host = host;
    }

    public void rent(){
        seeHouse();
        host.rent();    // 代理的功能: 帮房东租房子
        contract();
        takeMoney();
    }

    public void seeHouse(){
        // 中介做的事情 带客户看房
        System.out.println("中介带你看房");
    }

    public void contract(){
        // 中介做的事情 和你签订合同
        System.out.println("中介和你签合同");
    }

    public void takeMoney(){
        // 中介做的事情 收取中介费
        System.out.println("中介收费");
    }

}
