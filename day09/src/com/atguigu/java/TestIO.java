package com.atguigu.java;

import java.io.File;

/**
 * @ClassName Test
 * @Description TODO
 * @Author zhangcb
 * @Date 2021-3-2 17:43
 * @Version 1.0
 **/
public class TestIO {
    public static void main(String[] args) {
        File file = new File("hello.txt");//相较于当前工程
        System.out.println(file.getAbsolutePath());

        File file1 = new File("day09\\hello.txt");
        System.out.println(file1.getAbsolutePath());

        System.out.println("git-study-second-commit");
        System.out.println("git-study-third-commit");
        System.out.println("git-study-hot-fix");
        System.out.println("master test");
        System.out.println("hot-fix test");
    }
}
