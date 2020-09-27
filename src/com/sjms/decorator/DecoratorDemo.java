package com.sjms.decorator;

/**
 * 装饰者模式
 * 	可以通过不断的装饰完成更多的操作，并且不改变原类
 * @Description: TODO
 * @author nanshoudabaojian
 * @date 2020年9月25日 下午4:57:39
 */
public class DecoratorDemo {

	public static void main(String[] args) {
		Humburger humburger = new ChickenBurger("鸡腿堡");  
        System.out.println(humburger.getName()+"  价钱："+humburger.getPrice());  
        Lettuce lettuce = new Lettuce(humburger);  
        System.out.println(lettuce.getName()+"  价钱："+lettuce.getPrice());  
        Chilli chilli = new Chilli(humburger);  
        System.out.println(chilli.getName()+"  价钱："+chilli.getPrice());  
        Chilli chilli2 = new Chilli(lettuce);  
        System.out.println(chilli2.getName()+"  价钱："+chilli2.getPrice());
	}

}

//基类 被装饰者
abstract class Humburger{
	public String name;
	public String getName(){
		return name;
	}
	public abstract double getPrice();
}

// 汉堡的装饰者
class ChickenBurger extends Humburger{
	
	public ChickenBurger(String name){
		this.name = name;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 10;
	}
	
}

// 配菜的基类
abstract class Condiment extends Humburger {  
    public abstract String getName();  
}

// 装饰者 生菜
class Lettuce extends Condiment {  
    
    Humburger humburger;  
      
    public Lettuce(Humburger humburger){  
        this.humburger = humburger;  
    }  
  
    @Override  
    public String getName() {  
        return humburger.getName()+" 加生菜";  
    }  
  
    @Override  
    public double getPrice() {  
        return humburger.getPrice()+1.5;  
    }  
  
}

//装饰者 辣椒
class Chilli extends Condiment {  
    
    Humburger humburger;  
      
    public Chilli(Humburger humburger){  
        this.humburger = humburger;  
          
    }  
  
    @Override  
    public String getName() {  
        return humburger.getName()+" 加辣椒";  
    }  
  
    @Override  
    public double getPrice() {  
        return humburger.getPrice();  //辣椒是免费的哦  
    }  
  
}
