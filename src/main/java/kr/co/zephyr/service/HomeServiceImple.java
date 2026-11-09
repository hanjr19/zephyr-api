package kr.co.zephyr.service;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.zephyr.vo.BlogVo;

@Service
public class HomeServiceImple implements HomeService {
	@Autowired
	private SqlSession sqlSession;
	
	private String namespace="kr.co.zephyr.home";
	
	HashMap<String,Object> param = new HashMap<String, Object>();
	
	@Override
	public List<BlogVo> getTest(HashMap<String, Object> param){
		String sqlId = ".getTest";
		List<BlogVo> listBlog = sqlSession.selectList(namespace+sqlId,param);
		
		return listBlog;
	}
	
}
