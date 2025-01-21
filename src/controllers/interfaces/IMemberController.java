package controllers.interfaces;

import models.Member;

import java.util.List;

public interface IMemberController {
    void addMember(Member member);
    void removeMember(Member member);
    void updateMember(Member member);
    List<Member> getMembers();
}
