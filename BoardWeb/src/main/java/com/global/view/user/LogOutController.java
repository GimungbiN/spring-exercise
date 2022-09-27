package com.global.view.user;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import com.global.biz.board.BoardVO;
import com.global.biz.board.impl.BoardDAO;


@Controller
public class LogOutController{

	@RequestMapping("/logout.do")
	public String logout(HttpSession session) {
		System.out.println("�α׾ƿ� ó��");
		

		session.invalidate();
		return "login.jsp";
	}

}
