package com.global.view.board;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.global.biz.board.BoardVO;
import com.global.biz.board.impl.BoardDAO;


//@Controller
public class GetBoardController {

	//@RequestMapping("/getBoard.do")
	public ModelAndView handleRequest(BoardVO vo,BoardDAO dao,ModelAndView mav) {
		System.out.println("�� �� ��ȸ ó��");
		
		mav.addObject("board",dao.getBoard(vo));
		
		mav.setViewName("getBoard.jsp");
		
		return mav;
		
	
	}

}
