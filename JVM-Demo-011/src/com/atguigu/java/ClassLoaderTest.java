package com.atguigu.java;

//jvm规范指出了类加载器只分为引导类加载器(根加载器)和用户自定义类加载器 app/extClassLoader也是用户自定义类加载器
public class ClassLoaderTest {
    public static void main(String[] args) {
        //系统类加载器 (应用级别加载器)
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);

        //扩展类加载器
        ClassLoader extClassLoader = systemClassLoader.getParent();
        System.out.println(extClassLoader);

        //引导类加载器 (根加载器)
        ClassLoader bootstrapClassLoader = extClassLoader.getParent();
        System.out.println(bootstrapClassLoader);

        //用户自定义类默认由系统类加载器加载
        ClassLoader userClassLoader = ClassLoaderTest.class.getClassLoader();
        System.out.println(userClassLoader);

        //String类默认由引导类加载器 (根加载器)加载
        ClassLoader classLoader = String.class.getClassLoader();
        System.out.println(classLoader);
    }
}
