package kr.co.zephyr.home;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.zephyr.service.HomeService;
import kr.co.zephyr.vo.BlogVo;

@RestController
public class HomeController {
	@Autowired
	public HomeService homeService;
	
	@GetMapping("/api/test")
	public List<BlogVo> getTest() {
		System.out.println("getTest");
		
		Date today = new Date();
		
		HashMap<String,Object> param = new HashMap<String,Object>();
		
		List<BlogVo> listBlog = homeService.getTest(param);
		
		
		//List<BlogVo> listBlog = homeService.getTest();
		
		/*
		 * BlogVo blogVo = new BlogVo();
		 * 
		 * blogVo.setUuid("uuid1"); blogVo.setImgUrl("imgUrl1");
		 * blogVo.setTitle("title1"); blogVo.setContents("content1");
		 * blogVo.setDeleteYn("N"); blogVo.setUpdateUser("updateUser1");
		 * blogVo.setUpdateDate(today); blogVo.setCreateUser("updateUser2");
		 * blogVo.setCreateDate(today);
		 * 
		 * listBlog.add(blogVo);
		 */
		
		return listBlog;
	}
	
}
