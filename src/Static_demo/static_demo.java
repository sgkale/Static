package Static_demo;

class staticDemo {
    private static  int count;
    public staticDemo(){
        count++;
    }
    public static void showCount(){
        System.out.println(count + " count");
    }

}
public class static_demo{
    public static void main(String[] args) {
        staticDemo s1=new staticDemo();
        staticDemo s2=new staticDemo();
        staticDemo s3=new staticDemo();
        staticDemo s4=new staticDemo();
        staticDemo s5=new staticDemo();
        staticDemo.showCount();
    }
}

