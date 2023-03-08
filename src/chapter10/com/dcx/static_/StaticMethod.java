package chapter10.com.dcx.static_;

public class StaticMethod {
    public static void main(String[] args) {
        stu tom = new stu("tom");
        tom.payFee(100);
        //对象名.方法名/类名.方法名
        stu.payFee(100);
        stu jack = new stu("jack");
        jack.payFee(200);
        tom.showFee();
        stu.showFee();
        //不创建对象实例，也可以调用某个方法（当作工具使用）可选择静态方法。
        System.out.println(Mytools.get_sum(1,2));
    }
}
//开发工具类时，可将方法定义为静态的，方便调用。
class Mytools{
    public static int get_sum(int a, int b){
        return a + b;
    }

}
class stu{
    private String name;
    private static double fee = 0;
    public stu(String name) {
        this.name = name;
    }
    public static void payFee(double fee){
        stu.fee += fee;
    }
    public static void showFee(){
        System.out.println("sum of " + stu.fee);
    }

}
