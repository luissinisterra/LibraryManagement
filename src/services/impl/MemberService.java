package services.impl;

import models.Member;
import persistence.MemberDAO;
import services.interfaces.IMemberService;

import java.util.List;

public class MemberService implements IMemberService {

    private MemberDAO memberDAO;
    private List<Member> members;

    public MemberService() {
        this.memberDAO = new MemberDAO();
    }

    @Override
    public void addMember(Member member) {
        this.memberDAO.addMember(member);
    }

    @Override
    public void removeMember(Member member) {

    }

    @Override
    public void updateMember(Member member) {

    }

    @Override
    public List<Member> getMembers() {
        return List.of();
    }
}
