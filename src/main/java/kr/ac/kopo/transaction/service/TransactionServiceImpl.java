package kr.ac.kopo.transaction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.ac.kopo.transaction.dao.TransactionDAO;
import kr.ac.kopo.transaction.vo.TransactionVO;

@Service
public class TransactionServiceImpl implements TransactionService {
	
    @Autowired
    private TransactionDAO transactionDao;

    @Transactional
    @Override
    public void transfer(TransactionVO transaction) {
        try {
			transactionDao.decreaseBalance(transaction);
		} catch (Exception e) {
			e.printStackTrace();
		}
        try {
			transactionDao.increaseBalance(transaction);
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}
