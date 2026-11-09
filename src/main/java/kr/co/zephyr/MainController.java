package kr.co.zephyr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@GetMapping("/")
	public String home() {
		System.out.println("메인컨트롤러");
		System.out.println("메인컨트롤러 깃용2");
		
		return "Hello~!";
	}	
}
