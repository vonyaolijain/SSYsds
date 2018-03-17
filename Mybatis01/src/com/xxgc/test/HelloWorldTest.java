package com.xxgc.test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import com.xxgc.bean.Clas;
import com.xxgc.bean.Student;
import com.xxgc.mapper.ClasMapper;
import com.xxgc.mapper.StudentMapper;
import com.xxgc.mapper.StudentMapperSql;
import com.xxgc.util.MybatisTest;

public class HelloWorldTest {

	@Test
	public void test03() throws IOException {
		SqlSessionFactory Sqlsessionfactory = MybatisTest.getSqlSessionFactory();
		SqlSession sqlsession = Sqlsessionfactory.openSession();
		try {
			StudentMapper mapper = sqlsession.getMapper(StudentMapper.class);
			/* insert */
			Student student = new Student("zs", "ys");
			mapper.StuAdd(student);
			System.out.println(student);
			/*
			 * Student student=new Student(79, "lxx", "ss");
			 * mapper.StuUpd(student);
			 */
			/* mapper.StuDel(79); */
			sqlsession.commit();
		} finally {
			sqlsession.close();
		}
	}

	@Test
	public void test11() throws IOException {
		SqlSessionFactory Sqlsessionfactory = MybatisTest.getSqlSessionFactory();
		SqlSession sqlsession = Sqlsessionfactory.openSession();
		try {
			ClasMapper mapper = sqlsession.getMapper(ClasMapper.class);
			Clas c=mapper.getid(1);
			System.out.println(c);
		} finally {
			sqlsession.close();
		}
	}

	@Test
	public void test() throws IOException {
		SqlSessionFactory sqlSessionFactory = MybatisTest.getSqlSessionFactory();
		SqlSession session = sqlSessionFactory.openSession();
		try {
			Student student = (Student) session.selectOne("com.xxgc.bean.Student.selectStudent", 3);
			System.out.println(student);
		} finally {
			session.close();
		}
	}

	@Test
	public void test1() throws IOException {
		SqlSessionFactory sqlSessionFactory = MybatisTest.getSqlSessionFactory();
		SqlSession opensession = sqlSessionFactory.openSession();
		try {
			StudentMapper mapper = opensession.getMapper(StudentMapper.class);
			Student student = mapper.findbyid(71);
			System.out.println(mapper.getClass());
			System.out.println(student);
		}

		finally {
			opensession.close();
		}
	}

	
	//Ò»¼¶»º´æ
	@Test
	public void test33() throws IOException {
		SqlSessionFactory sqlSessionFactory = MybatisTest.getSqlSessionFactory();
		SqlSession opensession = sqlSessionFactory.openSession();
		try {
			StudentMapper mapper = opensession.getMapper(StudentMapper.class);
			Student student1 = mapper.findbyid(1);
			System.out.println(student1 +"ss");
			Student student2= mapper.findbyid(1);
			Student student3=mapper.findbyid(2);
			System.out.println(student3);
			System.out.println(student2+"ss");
		
		}

		finally {
			opensession.close();
		}
	}

	
	
	
	
	
	
	
	@Test
	public void test9() throws IOException {
		SqlSessionFactory sqlSessionFactory = MybatisTest.getSqlSessionFactory();
		SqlSession opensession = sqlSessionFactory.openSession();
		try {
			StudentMapper mapper = opensession.getMapper(StudentMapper.class);
			Student student = mapper.findalls(2);

			System.out.println(student.getName());
	/*		System.out.println(student.getClas());*/
		}

		finally {
			opensession.close();
		}
	}

	@Test
	public void test10() throws IOException {
		SqlSessionFactory sqlSessionFactory = MybatisTest.getSqlSessionFactory();
		SqlSession opensession = sqlSessionFactory.openSession();
		try {
			StudentMapper mapper = opensession.getMapper(StudentMapper.class);
			List<Student> students = mapper.findmh("%a%");
			for (Student s : students) {
				System.out.println(s);
			}
		}

		finally {
			opensession.close();
		}
	}
	
	@Test
	public void test13() throws IOException {
		SqlSessionFactory sqlSessionFactory = MybatisTest.getSqlSessionFactory();
		SqlSession opensession = sqlSessionFactory.openSession();
		try {
			ClasMapper mapper = opensession.getMapper(ClasMapper.class);
			Clas cl=mapper.getAll(1);

			System.out.println(cl);
			System.out.println(cl.getStu());
	/*		System.out.println(student.getClas());*/
		}

		finally {
			opensession.close();
		}
	}

	@Test
	public void test14() throws IOException {
		SqlSessionFactory sqlSessionFactory = MybatisTest.getSqlSessionFactory();
		SqlSession opensession = sqlSessionFactory.openSession();
		try {
			ClasMapper mapper = opensession.getMapper(ClasMapper.class);
			Clas cl=mapper.getAllfb(1);

			System.out.println(cl.getCname());
			/*System.out.println(cl.getStu());*/
	/*		System.out.println(student.getClas());*/
		}

		finally {
			opensession.close();
		}
	}


	@Test
	public void test18() throws IOException {
		SqlSessionFactory sqlSessionFactory = MybatisTest.getSqlSessionFactory();
		SqlSession opensession = sqlSessionFactory.openSession();
		try {
			StudentMapperSql mapper = opensession.getMapper(StudentMapperSql.class);
		Student st=new Student(null, "zs", null);
		List<Student> s=mapper.find(st);
		for(Student s2:s){
			System.out.println(s2);
		}
		
		}

		finally {
			opensession.close();
		}
	}
}
