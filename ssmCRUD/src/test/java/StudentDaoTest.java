import com.just.mapper.StudentDao;
import com.just.pojo.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext.xml")
public class StudentDaoTest {

    @Autowired
    private StudentDao studentDao ;

    @Test
    public void listBySplitPageTest() {
        List<Student> students = studentDao.listBySplitPage() ;

        for (Student s: students) {
            System.out.println(s);
        }
    }


    @Test
    public void createStudentTest()  {

        Student student = new Student() ;
        student.setName("he"+ new Random().nextInt(1000));
        student.setQq("26354"+ new Random().nextInt(1000));
        student.setTypes("java工程师"+ new Random().nextInt(1000));
        try {
            student.setStartDate(new SimpleDateFormat("yyyy-MM-dd").parse("2018-8-1"+ new Random().nextInt(9)));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        student.setSchool(new Random().nextInt(1000) + "大学");
        student.setStudentId("4595");
        student.setDailyLink("www.jnshu.com/28" + new Random().nextInt(1000));
        student.setWish("学习" + new Random().nextInt(1000));
        student.setCoach("内门弟子JAVA-" + new Random().nextInt(1000));
        student.setKnowFrom("知乎");
        student.setCreateAt(new Date(System.currentTimeMillis()));
        student.setUpdateAt(new Date(System.currentTimeMillis()));
        System.out.println(studentDao.insert(student));
    }


}
