package chapter10.com.dcx.CodeBlock;

public class CodeBlockDetail03 {
    public static void main(String[] args) {
        BBB b1 = new BBB();

    }
}
class AAA{
    {
        System.out.println("AAA 普通代码块");
    }
    public AAA(){
        //(1)super
        //(2)调用本类普通代码块
        System.out.println("构造器AAA");
    }
}
class BBB extends AAA{
    {
        System.out.println("BBB 普通代码块");
    }
    public BBB(){
        //(1)super
        //(2)调用本类普通代码块
        System.out.println("构造器BBB");
    }
}
