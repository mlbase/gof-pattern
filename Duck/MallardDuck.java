package Duck;

public class MallardDuck extends Duck{

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWing();
    }

    @Override
    public void display() {
        System.out.println("저는 물오리입니다");
    }
}
