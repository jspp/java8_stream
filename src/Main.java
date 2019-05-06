import com.ouyang.MyData;
import com.ouyang.Student;

public class Main {

    public static void main(String[] args) {
        /**
         * filter :   中间操作 条件过滤
         * collect ： 最终操作，转换为 list set map
         */
   /*     System.out.println("过滤-不合格的同学信息");
        List<Student> rss = MyData.getData().stream().filter(st->st.getScore()<60).collect(Collectors.toList());
        rss.forEach(sst->{
            System.out.println(sst);
        });*/
        /**
         * limit 中间操作  取几条
         * skip 中间操作  跳过几条
         * sorted 中间操作  自然排序+自定义排序  （顺序从小到大）
         */
       /* System.out.println("按成绩-排序 打印前5名");
        MyData.getData().stream().sorted((s1,s2)->s2.getScore()-s1.getScore()).limit(5).forEach(sst->{
            System.out.println(sst);
        });*/
        /**
         * count 最终，求数量
         * distinct 最终， 去掉重复
         */
       /* System.out.println(" 求总个数");
        System.out.println(MyData.getData().stream().count());
        System.out.println(MyData.getData().stream().distinct().count());*/
        /**
         * reduce : 减小，缩减，分解
         */
        System.out.println(" 求总分数");
        Student student = new Student("",0,0);
        MyData.getData().stream().reduce((s1,s2)->{
            // System.out.println(student);
            student.setScore(s1.getScore()+s2.getScore());
            return student;
        });
        System.out.println(student);


    }
}
