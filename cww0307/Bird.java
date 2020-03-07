package cww0307;
public class Bird extends Animal{
    public Bird(String name){
        super(name);
    }
    public  void  eat(String food){
        System.out.println("我是一种小鸟");
        System.out.println(this.name + "正在吃"+food);
    }
}
