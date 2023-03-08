package chapter10.com.dcx.CodeBlock;

public class CodeBlock01 {
    public static void main(String[] args) {
        Movie movie = new Movie("西游记");
        Movie movie1 = new Movie("三国演义", 100);
        Movie movie2 = new Movie("唐人街", 120, "陈");

    }
}
class Movie{
    private String name;
    private double price;
    private String director;
    //三个构造器===>重载
    //构造器相同语句比较冗余，可以放入代码块。
    //代码块调用的顺序优先于构造器。
    {
        System.out.println("start");
        System.out.println("ing");
        System.out.println("movie ing");
    }

    public Movie(String name, double price) {
        this.name = name;
        this.price = price;
        System.out.println("Movie(String name, double price)");
//        System.out.println("start");
//        System.out.println("ing");
//        System.out.println("movie ing");
    }



    public Movie(String name, double price, String director) {
        this.name = name;
        this.price = price;
        this.director = director;
//        System.out.println("start");
//        System.out.println("ing");
//        System.out.println("movie ing");
        System.out.println("Movie(String name, double price, String director)" );
    }

    public Movie(String name) {
        this.name = name;
//        System.out.println("start");
//        System.out.println("ing");
//        System.out.println("movie ing");
        System.out.println("Movie(String name)");
    }
}