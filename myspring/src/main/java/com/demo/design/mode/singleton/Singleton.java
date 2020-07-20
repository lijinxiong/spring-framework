package com.demo.design.mode.singleton;


// 饿汉式
//public class Singleton {

//	private final static Singleton INSTANCE = new Singleton();
//
//	private Singleton(){
//		// 反射、 怎么解决
//
//	}
//
//	public static Singleton getInstance(){
//		return INSTANCE;
//	}

//}


// =============================================
// 懒汉式
//public class Singleton {
//
//	// 禁止重排序、可见性
//	private volatile Singleton instance;
//
//	private Singleton(){}
//
//	public Singleton getInstance(){
//
//		if (instance == null) {
//			synchronized (this){
//				if (instance == null) {
//					instance = new Singleton();
//				}
//			}
//		}
//		return instance;
//	}
//
//}

// =============================================
// 内部类
//public class Singleton{
//
//	private Singleton(){}
//	public static Singleton getInstance(){
//		return Holder.INSTANCE;
//	}
//
//	private static class Holder{
//		private static Singleton INSTANCE = new Singleton();
//	}
//}

public enum Singleton {
	INSTANCE,
	;
}