package com.global.view.user;



import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.global.biz.user.UserVO;
import com.global.biz.user.impl.UserDAO;

@Controller
public class LoginController {

	@RequestMapping(value="/login.do",method = RequestMethod.GET)
	public String loginView(@ModelAttribute("user")	UserVO vo) {
		System.out.println("로그인 화면으로 이동.......");
		vo.setId("test");
		vo.setPassword("test123");
		return "login.jsp";
		
	}
	
	
	@RequestMapping(value="/login.do",method = RequestMethod.POST)
	public String login(UserVO vo,UserDAO dao,HttpSession session) {
		
		
    		System.out.println("로그인 처리");
    		
    		
    		if(vo.getId()==null||vo.getId().equals("")) {
    			throw new IllegalArgumentException("아이디를 똑바로 입력해주십시오.");
    		}
    		    		
    		UserVO user = dao.getUser(vo);
    		
    		
    		if(user != null){
    			session.setAttribute("userName", user.getName());
    	        return("getBoardList.do");
    		}else{
    			return("login.jsp");
    		}
    		
    		
    

	}}
