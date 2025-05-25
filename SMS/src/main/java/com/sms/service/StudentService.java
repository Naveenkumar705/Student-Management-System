package com.sms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.entity.Student;
import com.sms.repository.StudentRepo;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepo stuRepDao;
	
	// insert
	public Student insert(Student s1)
	{
		return stuRepDao.save(s1); 
	}
	
	
	// fetch all the records
	public List<Student> getallstd()
	{
		return stuRepDao.findAll();
	}
	
	//fetch single student by Id
	public Student getstdId(int rollno)
	{
		return stuRepDao.findById(rollno).get();
	}
	
	
	//fetch by Name
	
	public Student getByName(String name)
	{
		return stuRepDao.findByName(name);
	}
	
	
	// update 
	
	public Student updatestd(int rollno, Student newstd)
	{
		Student oldstd =  stuRepDao.findById(rollno).get();
		oldstd.setName(newstd.getName());
		oldstd.setAge(newstd.getAge());
		oldstd.setEmail(newstd.getEmail());
		oldstd.setDept(newstd.getDept());
		
		return stuRepDao.save(oldstd);
	}
	
	//delete
	
	public void deletestd(int rollno)
	{
		stuRepDao.deleteById(rollno);
	}


}
