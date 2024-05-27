package kr.ac.kopo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import kr.ac.kopo.vo.BankSystemVO;


@Controller
public class BankSystemController {
	    
	 @GetMapping("/mypage")
	    public String  mypage() {
	        return "banksystem/mypage";  
	    }
	}


