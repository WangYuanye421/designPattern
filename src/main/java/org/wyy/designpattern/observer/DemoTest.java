package org.wyy.designpattern.observer;

public class DemoTest {
    public static void main(String[] args) {
        DemoStudent student = new DemoStudent();
        DemoTeacher teacher1 = new DemoTeacher();
        DemoTeacher teacher2 = new DemoTeacher();
        student.addObserver(teacher1);
        student.addObserver(teacher2);
        student.setName("wyy");// 触发通知
    }
}
