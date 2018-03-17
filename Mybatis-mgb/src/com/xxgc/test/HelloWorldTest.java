package com.xxgc.test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import com.xxgc.bean.Student;
import com.xxgc.bean.StudentExample;
import com.xxgc.bean.StudentExample.Criteria;
import com.xxgc.dao.StudentMapper;
import com.xxgc.util.MybatisTest;

public class HelloWorldTest {

	@Test
	public void testMbg() throws Exception {
		List<String> warnings = new ArrayList<String>();
		boolean overwrite = true;
		File configFile = new File("mbg.xml");
		ConfigurationParser cp = new ConfigurationParser(warnings);
		Configuration config = cp.parseConfiguration(configFile);
		DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
		myBatisGenerator.generate(null);
	}

	/*
	 * @Test public void test01() throws IOException { SqlSessionFactory
	 * sqlSessionFactory = MybatisTest.getSqlSessionFactory(); SqlSession
	 * sqlSession = sqlSessionFactory.openSession();
	 * System.out.println(sqlSession); try { System.out.println(1);
	 * StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
	 * System.out.println(2); Student s = mapper.selectByPrimaryKey(1);
	 * System.out.println(s);
	 * 
	 * } finally { sqlSession.close(); } }
	 */

	@Test
	public void test02() throws IOException {
		SqlSessionFactory sqlSessionFactory = MybatisTest.getSqlSessionFactory();
		SqlSession sqlSession = sqlSessionFactory.openSession();

		try {

			StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
			StudentExample example = new StudentExample();
			Criteria c = example.createCriteria();
			c.andNameLike("%z%");
			List<Student> s=mapper.selectByExample(example);
			for (Student student : s) {
				System.out.println(student);
			}

		} finally {
			sqlSession.close();
		}
	}

}
