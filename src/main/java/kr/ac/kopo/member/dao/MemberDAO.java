package kr.ac.kopo.member.dao;

import kr.ac.kopo.vo.MemberVO;

public interface MemberDAO {
	
	MemberVO login(MemberVO member) throws Exception;

}
