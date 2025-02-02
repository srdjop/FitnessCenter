package com.classproject.FitnessCenter.Service.Impl;

import com.classproject.FitnessCenter.Service.MemberService;
import com.classproject.FitnessCenter.entity.Member;
import com.classproject.FitnessCenter.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    @Autowired
    public MemberServiceImpl(MemberRepository memberRepository) {this.memberRepository = memberRepository; }


    @Override
    public Member create(Member member) throws Exception {
        if (member.getId() != null) {
            throw new Exception("ID must be null!");
        }

        Member newMember = this.memberRepository.save(member);
        return newMember;
    }

    @Override
    public Boolean checkUsername(Member member) {
        return memberRepository.existsByUsername(member.getUsername());
    }

    @Override
    public Member findOneById(Long id) {
        return this.memberRepository.findOneById(id);
    }
}
