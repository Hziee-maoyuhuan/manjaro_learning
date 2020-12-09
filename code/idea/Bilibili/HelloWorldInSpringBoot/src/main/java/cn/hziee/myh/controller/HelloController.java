package cn.hziee.myh.controller;


import javax.xml.ws.RequestWrapper;

/**
 * 标明这是一个Controller
 */
@Controller
public class HelloController {

    @ResponseBody                   // 标明这里有一个返回 将字串写给浏览器
    @RequestMapping("/hello")       // 意思是接受浏览器的/hello请求
    public String hello(){
        return "Hello World!";
    }
}
