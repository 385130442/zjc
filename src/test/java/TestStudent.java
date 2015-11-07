import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zjc.model.SignUp;
import com.zjc.model.Student;
import com.zjc.service.IStudentService;
import com.zjc.service.impl.SignUpService;
import com.zjc.service.impl.StudentService;

public class TestStudent {
	private StudentService studentService ;
	private SignUpService signUpService;
	ApplicationContext context;
	@Before
	public void before(){
		context = new ClassPathXmlApplicationContext(new String[]{"classpath:ApplicationContext.xml"
	              ,"classpath:Configuration.xml"});
		studentService = (StudentService)context.getBean("StudentService");
		signUpService = (SignUpService)context.getBean("SignUpService");
	}
//	@Test 
//	
//	public void insertStudentTest(){
//		Student student = new Student();
//		student.setUsername("zjc");
//		student.setPassword("111");
//		student.setNickName("靓仔");
//		System.out.println(studentService.insertStudent(student));;
//	}
	@Test
	public void insertSignUpTest(){
		long time = System.currentTimeMillis();
		SignUp signUp = new SignUp();
		signUp.setUserName("zjc12325");
		signUp.setName("张佳晨");
		signUp.setStuNo("JAVA-L1-T1-005");
		signUp.setCreateAt(time);
		signUp.setUpdateAt(time);
		signUp.setPromise("111");
		System.out.println(signUpService.insertSignUp(signUp)+"signUp");;
	}
//	@Test
//	public void read(){
//	SignUp s = signUpService.selectByUsername("zjc");
//	System.out.println(s.getUserName() );
//	}
//	@Test
//	public void update(){
//		Map map = new HashMap();
//		
//		map.put("lastStuNo", "asdf");
//		map.put("name", "dfa");
//		map.put("promise", "dfas");
//		map.put("updateAt", System.currentTimeMillis());
//		map.put("firstStuNo", "JAVA-L1-T1-005");
//		
//		signUpService.updateSignUp(map);
//	}
}
