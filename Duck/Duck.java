package Duck;

public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck(){}

    public abstract void display();

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuak(){
        quackBehavior.quack();
    }

    public void swim(){
        System.out.println("모든 오릐는 물에 뜹니다. 가짜오리도 뜨죠");
    }

}
