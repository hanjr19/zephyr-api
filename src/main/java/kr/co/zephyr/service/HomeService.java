package kr.co.zephyr.service;

import java.util.HashMap;
import java.util.List;

import kr.co.zephyr.vo.BlogVo;

public interface HomeService {
	public List<BlogVo> getTest(HashMap<String,Object> paramMap);
}
