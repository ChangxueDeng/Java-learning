package chapter10.com.dcx.static_;

public class StaticMethodDetail {
    public static void main(String[] args) {
        //非静态方法不能通过类名调用
        D.hi();//ok
        //D.say();错误，需要对象。
        D d = new D();
        d.say();//ok
    }
}
class D{
    private int n = 100;
    static private int nn = 200;
    public void say(){//非静态方法
        //普通方法可访问非静态成员也可以访问静态成员
        hi();
        System.out.println(n);
    }
    public static void hi(){//静态方法
        //类方法不运行使用和对象有关的关键字
        //静态方法只能访问静态方法和成员变量.
        //System.out.println(this.n);
        System.out.println(nn);
    }

}