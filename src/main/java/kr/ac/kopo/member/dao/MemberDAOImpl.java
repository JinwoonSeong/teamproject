package kr.ac.kopo.member.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import kr.ac.kopo.member.vo.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO {

    @Autowired
    private SqlSessionTemplate sqlSession;
    
    @Override
    public MemberVO login(MemberVO member) throws Exception {
        MemberVO loginVO = sqlSession.selectOne("dao.MemberDAO.login", member);
        return loginVO;
    }

    @Override
    public void signUp(MemberVO member) throws Exception {
        sqlSession.insert("dao.MemberDAO.signUp", member);
    }
    @Transactional
	public int update_mypage(MemberVO member) throws Exception{
		return sqlSession.update("member.update_mypage", member);
	}
}
