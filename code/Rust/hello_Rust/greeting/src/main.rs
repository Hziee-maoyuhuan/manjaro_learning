fn main() {
    // Hello world
    println!("Hello, world!");

    // 输出一个值
    let a = 12;
    println!("输入数字: a is {}", a);
    // 输出多次一样的值
    println!("输出多个数字: a is {0} {0} {0}", a);

    // 需要输入括号的时候
    println!("左括号和右括号 {{  and  }}");

    // 声明变量 使用let
    let b = 3;
    println!("{}",b);
    /*
        禁止语句:
            a = "abc"; a = 4.56;    因为a这里是整形不能改变类型
            a = 456;                a是一个不可变变量 为安全性考虑
    */

    let mut c = 123;
    c = 456;
    println!("{}",c);

    






}
