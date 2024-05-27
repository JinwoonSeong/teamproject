package kr.ac.kopo.member.service;

import kr.ac.kopo.vo.MemberVO;

public interface MemberService {

	MemberVO login(MemberVO member) throws Exception;
}
