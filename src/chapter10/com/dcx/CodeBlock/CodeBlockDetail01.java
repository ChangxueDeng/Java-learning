package chapter10.com.dcx.CodeBlock;

public class CodeBlockDetail01 {
    public static void main(String[] args) {
        //静态代码块，在类被加载时执行(只会执行一次)
        //1.创建对象时
        //2.子类创建对象时父类先加载
        AA aa = new AA();
        //3.使用类的静态成员时
        System.out.println(cat.n1);
        DD d1 = new DD();
        DD d2 = new DD();
        //普通代码块每次创建对象都会执行一次，如果只是使用类的静态成员，普通不会执行
        System.out.println(DD.n1);//静态代码块一定会执行
    }
}
class AA extends BB{
    //静态代码块
    static {
        System.out.println("AA 静态代码块1执行");
    }

}
class BB{
    static {
        System.out.println("BB 静态代码块1执行");
    }
}
class Animal{
    static{
        System.out.println("Animal 静态代码块1执行");
    }
}

class cat extends Animal{
    public static int n1 = 999;
    static {
        System.out.println("cat 静态代码块1执行");
    }
}

class DD{
    static int n1 = 100;
    static {
        System.out.println("DD 静态代码块1执行");
    }
    {
        System.out.println("DD 普通代码块执行");
    }
}
