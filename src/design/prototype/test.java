package design.prototype;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

public class test {
	public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException, IOException {
		Student s1 = new Student();
		s1.setName("张三");
		s1.setBirthday(new Date(0));
		
		ArrayList<String> friends= new ArrayList<String>();
		friends.add("张小三");
		s1.setFriends(friends);
		School school = new School();
		school.setName("剑桥");
		s1.setSchool(school);
		
		Student s2 =s1.deepclone();
		s2.setName("李四");
		s2.getSchool().setName("图书馆");
		
		System.out.println(s1.getName());
		System.out.println(s2.getName());
	}
}


