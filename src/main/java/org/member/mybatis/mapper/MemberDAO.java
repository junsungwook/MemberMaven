package org.member.mybatis.mapper;

import java.util.List;

import org.member.mybatis.vo.MemberVO;


public interface MemberDAO {
	List<MemberVO> getMemberList();
	MemberVO findById(String id);
	void insert(MemberVO user);
	void update(MemberVO user);
	void delete(String id);
	List<MemberVO> search(String field,String word);
}
