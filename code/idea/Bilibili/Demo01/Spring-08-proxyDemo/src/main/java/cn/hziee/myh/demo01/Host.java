package cn.hziee.myh.demo01;

// 房东类 租房功能的实现类
public class Host implements Rent {

    @Override
    public void rent() {
        // 重写租房的方法
        System.out.println("租房");
    }
}
