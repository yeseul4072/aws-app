package awsproject.backend.service;

import java.util.List;
import awsproject.backend.domain.Member;
import awsproject.backend.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    private final MemberRepository memberRepository;

    @Autowired
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public Long join(Member member) {
        memberRepository.save(member);
        return member.getId();
    }

    public List<Member> findAll() {
        List<Member> result = memberRepository.findAll();
        return result;
    }

}
