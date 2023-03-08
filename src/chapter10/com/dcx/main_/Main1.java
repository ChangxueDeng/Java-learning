package chapter10.com.dcx.main_;

public class Main1 {
    private static String name = "My";
    private int n1 = 100;
    public static void main(String[] args) {
        System.out.println(name);//静态方法可以直接访问本来的静态成员
        hi();
        //ok(); no
        Main1 m1 = new Main1();
        m1.ok();//yes,需要先创建本类对象
        //System.out.println(n1);//静态方法main不可以访问非静态成员。
    }
    private static void hi(){
        System.out.println("hi");
    }
    private void ok(){
        System.out.println("ok");
    }
}
