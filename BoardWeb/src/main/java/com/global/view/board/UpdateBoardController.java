package com.global.view.board;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.global.biz.board.BoardVO;
import com.global.biz.board.impl.BoardDAO;

//@Controller
public class UpdateBoardController{

	//@RequestMapping("/updateBoard.do")
	public String updateBoard(BoardVO vo,BoardDAO dao) {
		System.out.println("글 수정 처리");
		
		
		dao.updateBoard(vo);

		//화면 응답
		
      
		
		return "getBoardList.do";
	}

}
