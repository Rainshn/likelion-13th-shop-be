package com.likelion13th.shop.repository;

import com.likelion13th.shop.entity.Member;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
@TestPropertySource(locations = "classpath:application.properties")
class MemberRepositoryTest {
    @Autowired
    MemberRepository memberRepository;

    @Test
    @DisplayName("회원가입 테스트")
    public void createMemberTest(){
        // 멤버 객체 세팅
        Member member = new Member();

        // 멤버 객체에 이름, 아이디(이메일),비밀번호, 주소 세팅
        member.setName("김하나");
        member.setEmail("rainshn@swu.ac.kr");
        member.setPassword("Password1234");
        member.setAddress("서울시 노원구");

        // memberRepository의 save 메서드 사용해서 해당 객체 저장
        Member savedMember = memberRepository.save(member);

        // System.out.println() 함수로 객체 출력
        // (Member 엔티티에 @ToString 어노테이션 추가 후 member.toString()을 출력)
        System.out.println(member.toString());
    }
}