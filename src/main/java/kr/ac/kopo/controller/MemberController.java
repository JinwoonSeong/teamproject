package kr.ac.kopo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import kr.ac.kopo.member.service.MemberService;
import kr.ac.kopo.member.vo.MemberVO;

@SessionAttributes({"userVO"})
@Controller
public class MemberController {

	@Autowired
	private MemberService memberService;
	
	@GetMapping("/login")
	public String loginForm() {
	
		return "member/login";
	}
	
	/*
	 	1. 파라미터 추출(ID, PASSWORD)
	 	2. t_member테이블에 추출한 데이터의 회원 존재여부 판단
	*/
	/**
	 * 스프링 세션에 등록하는 방식으로 로그인 구현
	 *
	 */
	@PostMapping("/login")
	public String login(MemberVO member, Model model) throws Exception {
		
		MemberVO loginVO = memberService.login(member);
		if(loginVO == null) {
			// 로그인 실패
			return "member/login";
		} else {
			// 로그인 성공
			model.addAttribute("userVO", loginVO);
			return "redirect:/"; 
		}
	}
	
	@GetMapping("/logout")
	public String logout(SessionStatus status) {
		status.setComplete();
		return "redirect:/";
	}
	
	@GetMapping("/signup")
	public String signUpForm() {
	    return "member/signup";
	    }

	@PostMapping("/signup")
	public String signUp(MemberVO member, Model model) throws Exception { // 회원가입 처리
	System.out.println(member);
		memberService.signUp(member);// 회원가입 후 로그인 페이지로 리다이렉트
	        return "redirect:/login";
	    }
}







