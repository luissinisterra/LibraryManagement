package controllers.impl;

import controllers.interfaces.IMemberController;
import models.Member;
import services.impl.MemberService;

import java.util.List;

public class MemberController implements IMemberController {

    private MemberService memberService;

    public MemberController() {
        memberService = new MemberService();
    }

    @Override
    public void addMember(Member member) {
        this.memberService.addMember(member);
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
