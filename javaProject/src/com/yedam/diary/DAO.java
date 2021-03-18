package com.yedam.diary;

import java.util.List;

public interface DAO {
	public int insert(DiaryVO vo);
	public int update(DiaryVO vo);
	public int delete(String date);
	public DiaryVO selectDate(String date);
	public List<DiaryVO> selectContent(String content);
	public List<DiaryVO> selectAll();
}
