//HomeController
package com.test.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.test.web.vo.TestVO;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "main";
	}
	
	@RequestMapping(value = "send1", method = RequestMethod.GET)
	public String send1(String a, int b) {
		System.out.println(a);
		System.out.println(b);
		return "index";
	}
	
	@RequestMapping(value = "send2", method = RequestMethod.GET)
	public String send2(String a, int b) {
		System.out.println(a);
		System.out.println(b);
		return "index";
	}
	
	@RequestMapping(value = "send3", method = RequestMethod.POST)
	public String send3(String a, int b) {
		System.out.println(a);
		System.out.println(b);
		return "index";
	}
	
	@RequestMapping(value = "send4", method = {RequestMethod.GET, RequestMethod.POST})
	public String send4(TestVO vo) {
		System.out.println(vo);
		return "index";
	}
}


//TestController
package com.test.web.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.test.web.service.TestService;
import com.test.web.vo.TestVO;

@Controller
@RequestMapping("/test")
public class TestController {
	
	@Autowired
	private TestService service;
	
	@RequestMapping(value = "testInsert", method = RequestMethod.GET)
	public String testInsert(TestVO vo) {
		service.testInsert(vo);
		return "main";
	}
	
	@RequestMapping(value = "testSession1", method = RequestMethod.GET)
	public String testSession1(HttpSession session) {
		session.setAttribute("test", "세션값");
		return "main";
	}
	
	@RequestMapping(value = "testSession2", method = RequestMethod.GET)
	public String testSession2(HttpSession session) {
		session.removeAttribute("test");
		return "main";
	}
}
