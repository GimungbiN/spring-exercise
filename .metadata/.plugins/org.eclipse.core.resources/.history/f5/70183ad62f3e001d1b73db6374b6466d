package com.global.biz.board;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BoardServiceClient {

	public static void main(String[] args) {
		
		
		//1.spring 컨테이너를 구동한다.
		AbstractApplicationContext container = 
				new GenericXmlApplicationContext("applicationContext.xml");
		
		
		
		
		//2.spring 컨테이너로부터 boardserviceimpl 객체를 요청한다.
		BoardService boardService = (BoardService)container.getBean("boardService");
		
		//3.글 등록 기능 테스트
		BoardVO vo = new BoardVO();
		//vo.setSeq(100);
		vo.setTitle("Spring Mybatis 두번째 방법");
		vo.setWriter("홍길동");
		vo.setContent("Spring Mybatis 두번쨰 방법 내용 .........................");
		
		vo.setSearchCondition("TITLE");
		vo.setSearchKeyword("");
		
		boardService.insertBoard(vo);
		
		
		//4. 글 목록 검색 기능 테스트
		
		List<BoardVO> boardList=boardService.getBoardList(vo);
		
		for(BoardVO board:boardList) {
			System.out.println("---------->"+board.toString());
			
		}
		
		container.close();
	}
	
	
	
}
