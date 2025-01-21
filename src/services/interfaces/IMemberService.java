package services.interfaces;

import models.Member;

import java.util.List;

public interface IMemberService {
    void addMember(Member member);
    void removeMember(Member member);
    void updateMember(Member member);
    List<Member> getMembers();
}
