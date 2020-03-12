package com.zjtd;


/**
 * 有一个 n 边形 (P_0, P_1, ... , P_n)，每一边皆为垂直或者水平(|x1-x2| |y1-y1|)，下面考虑一般情况
 * 现给定数值 k，以 P_0 为起点，将 n 边形周长等分为 k 段，请打印所有的 k 等分点 (T_0, T_1, ... , T_k) 的坐标。
 * 
 * 每一边皆为垂直或者水平(|x1-x2| |y1-y1|)，下面考虑一般情况->任意两点的距离
 * 
 * @author nanshoudabaojian
 *
 */
public class 多边形周长等分 {
	//两点之间的距离 正正得正 负负得正
	public static double getDistance(Point p1, Point p2){
		return Math.sqrt((p2.x-p1.x)*(p2.x-p1.x) + (p2.y-p1.y)*(p2.y-p1.y));
	}
	//求周长
	public static double getPeremeter(Point[] points){
		int len = points.length;
		double permeter = 0;
		for(int i=0; i<len; i++){
			permeter += getDistance(points[i], points[(i+1)%len]);
		}
		return permeter;
	}
	//求等分点->周长等分
	public static void splitPermeter(){
		
	}
	public static void main(String[] args) {
		Point p1 = new Point(0,0);
		Point p2 = new Point(0,3);
		Point p3 = new Point(4,0);
		Point[] points = {p1,p2,p3};
//		System.out.println(getDistance(p3,p2));
		System.out.println(getPeremeter(points));
		
	}
}

class Point{
	public double x;
	public double y;
	public Point(){
		
	}
	public Point(double x, double y){
		this.x = x;
		this.y = y;
	}
}