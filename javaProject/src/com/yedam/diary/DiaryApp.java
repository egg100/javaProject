package com.yedam.diary;

public class DiaryApp {
	DAO dao;

	public void start() {
		dao = new DiaryListDAO();
//		dao = new DiaryOracleDAO();

		int menuNum = 0;

		do {
			menuPrint();
			menuNum = menuChoose();

			process(menuNum);

		} while (menuNum != 0);
		System.out.println("end");
	}

	// 메뉴출력
	public void menuPrint() {
		Menu[] arr = Menu.values();
		int i = 0;
		for (Menu menu : arr) {
			System.out.print(String.format("%d:%s ", i, menu.name()));
			i++;
		}
		System.out.println();
	}

	// 메뉴선택
	public int menuChoose() {
		int menuSize = Menu.values().length - 1;
		int menuNum;// = StdInputUtil.readInt();
		do {
			menuNum = StdInputUtil.readInt();
			if (menuNum <= menuSize && menuNum >= 0)
				break;

			System.out.println(menuSize + "까지만 입력이 가능합니다.");
		} while (true);
		return menuNum;
	}

	public void process(int menuNum) {
		Menu menu = Menu.getMenu(menuNum);
		switch (menu) {
		case 종료: exit(); break;
		case 추가: insert(); break;
		case 수정: update(); break;
		case 삭제: delete(); break;
		case 전체조회: selectAll(); break;
		}
	}
	
	//종료
	public void exit() {
		System.out.println("종료선택>>");
	}
	
	//입력
	public void insert() {
		System.out.println("입력선택>>");
		System.out.println("날짜:[yyMMdd]");
		String wdate = StdInputUtil.readDate();
		System.out.println("내용:");
		String contents = StdInputUtil.readMultiLine();
		
		DiaryVO vo = new DiaryVO();
		vo.setWdate(wdate);
		vo.setCotents(contents);
		int cnt = dao.insert(vo);
		System.out.println(cnt + "건 입력완료.");
	}
	
	//수정
	public void update() {
		System.out.println("수정선택>>");
		System.out.println("날짜:[yyMMdd]");
		String wdate = StdInputUtil.readDate();
		System.out.println("내용:");
		String contents = StdInputUtil.readMultiLine();
		DiaryVO vo = new DiaryVO();
		vo.setWdate(wdate);
		vo.setCotents(contents);
		int r = dao.update(vo);
		System.out.println(r + "건 수정됨.");
	}
	
	//삭제
	public void delete() {
		System.out.println("삭제선택>>");
		System.out.println("날짜:[yyMMdd]");
		String wdate = StdInputUtil.readDate();
		int r = dao.delete(wdate);
		System.out.println(r + "건 삭제됨.");
	}
	
	//전체조회
	public void selectAll() {
		System.out.println("전체조회선택>>");
		for(DiaryVO vo : dao.selectAll()) {
			System.out.println(vo.getWdate());
			System.out.println(vo.getCotents());
		}
	}
} // end of class
