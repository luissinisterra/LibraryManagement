package services.impl;

import models.Member;
import persistence.MemberDAO;
import services.interfaces.IMemberService;

import java.util.List;

public class MemberService implements IMemberService {

    private MemberDAO memberDAO;
    private List<Member> members;

    public MemberService() {

    }

    @Override
    public void addMember(Member member) {

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
