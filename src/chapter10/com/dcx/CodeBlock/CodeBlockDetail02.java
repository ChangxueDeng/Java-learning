package chapter10.com.dcx.CodeBlock;

public class CodeBlockDetail02 {
    public static void main(String[] args) {
        A a = new A();
    }
}
//代码块调用顺序
//调用静态代码块和静态属性初始化，优先级一样，按照定义顺序调用。
//调用普通代码块和静态属性初始化，优先级一样，按照定义顺序调用。
//调用构造器
class A{
    //静态属性初始化
    private static int n1 = getN1();
    private int n2 = getN2();
    {
        System.out.println("A codeblock");
    }
    static {
        System.out.println("A static codeblock");
    }

    public static int getN1(){

        System.out.println("getN1 runing");
        return 100;
    }
    public int getN2(){
        System.out.println("getN2 runing");
        return 200;
    }
    //无参构造
    public A(){
        System.out.println("A creat tool");
    }
}