package com.zjtd;


/**
 * ��һ�� n ���� (P_0, P_1, ... , P_n)��ÿһ�߽�Ϊ��ֱ����ˮƽ(|x1-x2| |y1-y1|)�����濼��һ�����
 * �ָ�����ֵ k���� P_0 Ϊ��㣬�� n �����ܳ��ȷ�Ϊ k �Σ����ӡ���е� k �ȷֵ� (T_0, T_1, ... , T_k) �����ꡣ
 * 
 * ÿһ�߽�Ϊ��ֱ����ˮƽ(|x1-x2| |y1-y1|)�����濼��һ�����->��������ľ���
 * 
 * @author nanshoudabaojian
 *
 */
public class ������ܳ��ȷ� {
	//����֮��ľ��� �������� ��������
	public static double getDistance(Point p1, Point p2){
		return Math.sqrt((p2.x-p1.x)*(p2.x-p1.x) + (p2.y-p1.y)*(p2.y-p1.y));
	}
	//���ܳ�
	public static double getPeremeter(Point[] points){
		int len = points.length;
		double permeter = 0;
		for(int i=0; i<len; i++){
			permeter += getDistance(points[i], points[(i+1)%len]);
		}
		return permeter;
	}
	//��ȷֵ�->�ܳ��ȷ�
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