package com.ouyang;

import java.util.ArrayList;
import java.util.List;

/**
 * ouyangjie
 * 2019/5/5
 * 17:26
 */
public class MyData {

    public static List<Student> getData(){
        List<Student> sts = new ArrayList<Student>();
        sts.add(new Student("张三",99,18));
        sts.add(new Student("李四",80,17));
        sts.add(new Student("王五",59,16));
        sts.add(new Student("周杰",58,16));
        sts.add(new Student("赵六",69,17));
        sts.add(new Student("孙策",69,17));
        return sts;
    }

}
