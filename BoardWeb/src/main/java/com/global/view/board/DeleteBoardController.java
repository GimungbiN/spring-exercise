package com.global.view.board;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.global.biz.board.BoardVO;
import com.global.biz.board.impl.BoardDAO;


//@Controller
public class DeleteBoardController{

	//@RequestMapping("deleteBoard.do")
	public String deleteBoard(BoardVO vo,BoardDAO dao) {
		System.out.println("글 삭제 처리");
		//사용자 입력 정보 추출
		
		dao.deleteBoard(vo);
		
		return "getBoardList.do";
	}

}
