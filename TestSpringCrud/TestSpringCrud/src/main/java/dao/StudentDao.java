package dao;

import java.util.List;

import javax.transaction.Transactional;

import org.idb.components.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

@Component
public class StudentDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Transactional
	public void createStudent(Student s) {

		hibernateTemplate.saveOrUpdate(s);

	}
	public List<Student>getAll(){
		
		return hibernateTemplate.loadAll(Student.class);
		
	}
	
	@Transactional
	public void delete(int id) {
		Student s=hibernateTemplate.load(Student.class,id);
		
		hibernateTemplate.delete(s);
		
		
	}
	
	public Student getById(int id) {
		
		 return hibernateTemplate.get(Student.class, id);
		
		
		
	}
}
