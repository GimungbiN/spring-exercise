package com.global.view.board;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.global.biz.board.BoardVO;
import com.global.biz.board.impl.BoardDAO;

//@Controller
public class GetBoardListController {

	//@RequestMapping("/getBoardList.do")
	public ModelAndView getBoardList(BoardVO vo,BoardDAO dao,ModelAndView mav) {
		
    		System.out.println("글 목록 조회 처리");
    		
    		
    		
    		//검색 결과와 화면정보를 modelandview에 저장하여 리턴함
    		
    		
    		mav.addObject("boardList",dao.getBoardList(vo));
    		
    		mav.setViewName("getBoardList.jsp");
    		
    		return mav;
	}

}
