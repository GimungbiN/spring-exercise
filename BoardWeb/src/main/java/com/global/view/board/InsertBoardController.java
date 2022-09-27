package com.global.view.board;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.global.biz.board.BoardVO;
import com.global.biz.board.impl.BoardDAO;

//@Controller
public class InsertBoardController {

	//@RequestMapping(value="/insertBoard.do")
	public String insertBoard(BoardVO vo,BoardDAO dao) {
		System.out.println("글 등록 처리");
		
		
		dao.insertBoard(vo);
		
		return "getBoardList.do";
	
	}

}
