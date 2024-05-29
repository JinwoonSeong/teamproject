package kr.ac.kopo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import kr.ac.kopo.transaction.service.TransactionService;
import kr.ac.kopo.transaction.vo.TransactionVO;

@Controller
public class TransactionController {
    @Autowired
    private TransactionService transactionService;
    
    @GetMapping("/transfer")
    public String accountRegisterForm() {
        return "account/transfer";
    }
    
    @PostMapping("/transfer")
    public String transfer(@RequestBody TransactionVO transaction) {
        transactionService.transfer(transaction);
        return "redirect:/";
    }
}
