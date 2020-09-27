package com.sjms.decorator;

/**
 * װ����ģʽ
 * 	����ͨ�����ϵ�װ����ɸ���Ĳ��������Ҳ��ı�ԭ��
 * @Description: TODO
 * @author nanshoudabaojian
 * @date 2020��9��25�� ����4:57:39
 */
public class DecoratorDemo {

	public static void main(String[] args) {
		Humburger humburger = new ChickenBurger("���ȱ�");  
        System.out.println(humburger.getName()+"  ��Ǯ��"+humburger.getPrice());  
        Lettuce lettuce = new Lettuce(humburger);  
        System.out.println(lettuce.getName()+"  ��Ǯ��"+lettuce.getPrice());  
        Chilli chilli = new Chilli(humburger);  
        System.out.println(chilli.getName()+"  ��Ǯ��"+chilli.getPrice());  
        Chilli chilli2 = new Chilli(lettuce);  
        System.out.println(chilli2.getName()+"  ��Ǯ��"+chilli2.getPrice());
	}

}

//���� ��װ����
abstract class Humburger{
	public String name;
	public String getName(){
		return name;
	}
	public abstract double getPrice();
}

// ������װ����
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

// ��˵Ļ���
abstract class Condiment extends Humburger {  
    public abstract String getName();  
}

// װ���� ����
class Lettuce extends Condiment {  
    
    Humburger humburger;  
      
    public Lettuce(Humburger humburger){  
        this.humburger = humburger;  
    }  
  
    @Override  
    public String getName() {  
        return humburger.getName()+" ������";  
    }  
  
    @Override  
    public double getPrice() {  
        return humburger.getPrice()+1.5;  
    }  
  
}

//װ���� ����
class Chilli extends Condiment {  
    
    Humburger humburger;  
      
    public Chilli(Humburger humburger){  
        this.humburger = humburger;  
          
    }  
  
    @Override  
    public String getName() {  
        return humburger.getName()+" ������";  
    }  
  
    @Override  
    public double getPrice() {  
        return humburger.getPrice();  //��������ѵ�Ŷ  
    }  
  
}
