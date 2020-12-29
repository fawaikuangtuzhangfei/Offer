package com.sjms.decorator;

/**
 * 装饰者模式
 * 通过不断装配来达到想要的效果
 * @Description: TODO
 * @author nanshoudabaojian
 * @date 2020年9月27日 上午9:23:02
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

// 基类
abstract class Person{
	public abstract void doSomething();
	public abstract void go();
}

//被装饰者
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
		System.out.println("唱轻歌...");
	}
	
	private void todance(){
		System.out.println("去参加美好的化妆舞会...");
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
		System.out.println("唱歌...");
	}
	
	private void goDance(){
		System.out.println("去参加舞会...");
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
		System.out.println("唱情歌...");
	}
	
	private void dance(){
		System.out.println("去参加化妆舞会...");
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
