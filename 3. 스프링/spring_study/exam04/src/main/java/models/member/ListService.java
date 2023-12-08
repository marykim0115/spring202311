package models.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListService {
    private  MemberDAO memberDAO;

    @Autowired
    public void setMemberDao(MemberDAO memberDao) {

        this.memberDAO = memberDao;
    }

    public void print() {
        List<Member> members = memberDAO.getList();
        for (Member member : members) {
            System.out.println(member);
        }
    }
}
