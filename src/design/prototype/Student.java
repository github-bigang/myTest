package design.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Student implements Serializable {
	
	private String name;
	private Date birthday;
	private School school;
	private List<String> friends;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Date getBirthday() {
		return birthday;
	}


	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}


	public School getSchool() {
		return school;
	}


	public void setSchool(School school) {
		this.school = school;
	}


	public List<String> getFriends() {
		return friends;
	}


	public void setFriends(List<String> friends) {
		this.friends = friends;
	}


	
	public Student deepclone() throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		//return (Student)super.clone();
//		Student student = (Student) super.clone();
//		student.school = school.clone();
		ByteArrayOutputStream bo = new ByteArrayOutputStream();
		ObjectOutputStream oo = new ObjectOutputStream(bo);
		oo.writeObject(this);
		
		ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
		ObjectInputStream oi = new ObjectInputStream(bi);
		Student s = (Student)oi.readObject();
		
		
		return s;
	}
}





