import com.just.mapper.StudentMapper;
import com.just.pojo.Student;
import com.just.util.MicroDES;
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
    private StudentMapper studentDao ;

    @Test
    public void createStudentTest()  {

        Student student = new Student() ;
        student.setName("he"+ new Random().nextInt(1000));
        student.setQq("26354"+ new Random().nextInt(1000));
        student.setTypes("java工程师"+ new Random().nextInt(1000));
            student.setStartDate(new Date().getTime());
        student.setSchool(new Random().nextInt(1000) + "大学");
        student.setStudentId("4595");
        student.setDailyLink("www.jnshu.com/28" + new Random().nextInt(1000));
        student.setWish("学习" + new Random().nextInt(1000));
        student.setCoach("内门弟子JAVA-" + new Random().nextInt(1000));
        student.setKnowFrom("知乎");
        student.setCreateAt(System.currentTimeMillis());
        student.setUpdateAt(System.currentTimeMillis());
        System.out.println(studentDao.insertSelective(student));
    }


    @Test
    public void DESTest() {
        String key = "098f6bcd4621d373cade4e832627b4f62017121611345734";// 48个长度的字符串即可
        String param = "王鑫";
        String encr = MicroDES.encr(key, param);
        String decr = MicroDES.decr(key, encr);
        System.out.println("key:" + key);
        System.out.println(param + " ==>> " + encr);
        System.out.println(encr + " ==>> " + decr);
    }
}
