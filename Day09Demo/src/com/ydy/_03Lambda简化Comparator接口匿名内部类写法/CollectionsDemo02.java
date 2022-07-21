package com.ydy._03Lambda简化Comparator接口匿名内部类写法;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
    目标：Lambda简化Comparator接口匿名内部类写法。


 */
public class CollectionsDemo02 {
    public static void main(String[] args) {
        List<Student> lists = new ArrayList<>();
        Student student1 = new Student("ydy", 21, '男');
        Student student2 = new Student("llh", 20, '男');
        Student student3 = new Student("wwd", 22, '男');
        Collections.addAll(lists,student1,student2,student3);

        //按照年龄升序排序！

//        Collections.sort(lists, new Comparator<Student>() {
//            @Override
//            public int compare(Student s1, Student s2) {
//                return s1.getAge()- s2.getAge();
//            }
//        });

        Collections.sort(lists,(Student s1, Student s2)-> {
            return s1.getAge() - s2.getAge();
        });
        //超级简化
        Collections.sort(lists,(Student s1, Student s2) -> s1.getAge() - s2.getAge());
        //超级简化2
        Collections.sort(lists,(s1, s2) -> s1.getAge() - s2.getAge());
        System.out.println(lists);
    }
}
