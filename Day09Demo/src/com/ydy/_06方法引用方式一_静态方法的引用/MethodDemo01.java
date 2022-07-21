package com.ydy._06方法引用方式一_静态方法的引用;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
    目标：方法引用的四种形式：
        1.静态方法的引用。
        2.实例方法的引用。
        3.特点类型方法的引用。
        4.构造器引用。

    1.静态方法的引用。
        引用格式：
            类名::静态方法。
        简化步骤:
            a.定义一个静态方法，把需要简化的代码放到一个静态方法中去。
        静态方法引用的注意事项：
            ”重要:被引用的方法的参数列表要和函数式接口中的抽象方法的参数列表一致。“
            如果函数式接口中的抽象方法有返回值，则被引用的方法必须也有相同的返回值
            如果函数式接口中的抽象方法没有返回值，则被引用的方法可以有返回值，也可以没有返回值。

    小结：
        静态方法引用的格式：类名::静态方法。
        重要：被引用的方法的参数列表要和函数式接口中的抽象方法打参数列表一致，才可以引用简化！
 */
public class MethodDemo01 {
    public static void main(String[] args) {
        List<Student> lists = new ArrayList<>();
        Student student1 = new Student("ydy", 21, '男');
        Student student2 = new Student("llh", 20, '男');
        Student student3 = new Student("wwd", 22, '男');
        Collections.addAll(lists,student1,student2,student3);

        //按照年龄升序排序！
        Collections.sort(lists,(s1, s2) -> s1.getAge() - s2.getAge());
        //使用静态方法简化
        Collections.sort(lists,(s1,s2)->Student.compareByAge(s1,s2));
        //如果前后参数是一样的，而且方法是静态方法，既可以使用静态方法引用。
        Collections.sort(lists,Student::compareByAge);
        System.out.println(lists);
    }
}
