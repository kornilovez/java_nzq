package ru.stqa.pft.sandbox;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class MyFirstProgram {

	public static void main(String[] args) {

	    hello("user");
	    hello("Andrey");
	    hello("vsem salyam");

	    Square s = new Square(5);
	    System.out.println("Площадь кв со стороной " + s.l + " = " + s.area());

		Rectangle r = new Rectangle(5, 6);
		System.out.println("Площадь прямоуг. со сторонами " + r.a + " и " + r.b + " = " + r.area());

		Point p1 = new Point(0, 1);
		Point p2 = new Point(2, -2);

		System.out.println("Расстояние между точками p1(" + p1.a + "," + p1.b +")" + " и p2(" + p2.a + "," + p2.b + ")" + " равно " + p1.distance(p2));
//		System.out.println(String.format("Расстояние между точками p1(%1$s, %2$s) и p2(%3$s, %4$s) равно %5$s", p1.a, p1.b, p2.a, p2.b, p1.distance(p2)));

//		первый варик
//		Point p1 = new Point();
//		p1.a = 0;
//		p1.b = 1;
//
//		Point p2 = new Point();
//		p2.a = 2;
//		p2.b = -2;
//
//		System.out.println(distance(p1, p2));


//		public static double distance(Point p1, Point p2) {
//
//			return Math.sqrt(Math.pow((p2.b - p1.b), 2) + (Math.pow((p2.a - p1.a), 2)));
//		}

//		второй варик

//		Point p1 = new Point(0, 1);
//		Point p2 = new Point(2, -2);
//
//		System.out.println(distance(p1, p2));


	}

	public static void hello(String somebody) {

		System.out.println("Hello, " + somebody + "!");
	}

//	для первого и второго варика
//	public static double distance(Point p1, Point p2) {
//
//		return Math.sqrt(Math.pow((p2.b - p1.b), 2) + (Math.pow((p2.a - p1.a), 2)));
//	}



}