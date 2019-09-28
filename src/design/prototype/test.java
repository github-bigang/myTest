package design.prototype;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

public class test {
	public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException, IOException {
		Student s1 = new Student();
		s1.setName("����");
		s1.setBirthday(new Date(0));
		
		ArrayList<String> friends= new ArrayList<String>();
		friends.add("��С��");
		s1.setFriends(friends);
		School school = new School();
		school.setName("����");
		s1.setSchool(school);
		
		Student s2 =s1.deepclone();
		s2.setName("����");
		s2.getSchool().setName("ͼ���");
		
		System.out.println(s1.getName());
		System.out.println(s2.getName());
	}
}


