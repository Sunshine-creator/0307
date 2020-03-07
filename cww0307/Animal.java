package cww0307;
public class Animal {
    protected String name;
    public Animal(String name) {
        this.name = name;
    }
    public void eat(String food){
        System.out.println(this.name + "正在吃"+food);
        System.out.println("我是一种小动物");
    }
}
