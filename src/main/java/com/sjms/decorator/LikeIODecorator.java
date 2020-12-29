package com.sjms.decorator;

/**
 * װ����ģʽ
 * ͨ������װ�����ﵽ��Ҫ��Ч��
 * @Description: TODO
 * @author nanshoudabaojian
 * @date 2020��9��27�� ����9:23:02
 */
public class LikeIODecorator {
	public static void main(String[] args) {
		ZeroPerson zeroPerson = new ZeroPerson();
//		TwoPerson person = new TwoPerson(new FirstPerson(zeroPerson));
		TwoPerson person = new TwoPerson(zeroPerson);
		person.doSomething();
		person.go();
	}
}

// ����
abstract class Person{
	public abstract void doSomething();
	public abstract void go();
}

//��װ����
class ManyPerson extends Person{
	public Person person;
	
	public ManyPerson(Person person){
		this.person = person;
	}

	@Override
	public void doSomething() {
		person.doSomething();
	}

	@Override
	public void go() {
		person.go();
	}
	
}

class TwoPerson extends ManyPerson{
	
	public TwoPerson(Person person){
		super(person);
		this.person = person;
	}
	
	private void tosing(){
		System.out.println("�����...");
	}
	
	private void todance(){
		System.out.println("ȥ�μ����õĻ�ױ���...");
	}

	@Override
	public void doSomething() {
		super.doSomething();
		tosing();
	}

	@Override
	public void go() {
		super.go();
		todance();
	}
	
}

class FirstPerson extends ManyPerson{
	
	public FirstPerson(Person person){
		super(person);
		this.person = person;
	}
	
	private void doSing(){
		System.out.println("����...");
	}
	
	private void goDance(){
		System.out.println("ȥ�μ����...");
	}

	@Override
	public void doSomething() {
		super.doSomething();
		doSing();
	}

	@Override
	public void go() {
		super.go();
		goDance();
	}
	
}

class ZeroPerson extends Person{
	
	public ZeroPerson(){
		super();
	}
	
	private void sing(){
		System.out.println("�����...");
	}
	
	private void dance(){
		System.out.println("ȥ�μӻ�ױ���...");
	}

	@Override
	public void doSomething() {
		sing();
	}

	@Override
	public void go() {
		dance();
	}
	
}
