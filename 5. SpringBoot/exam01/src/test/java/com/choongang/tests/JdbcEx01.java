package com.choongang.tests;

import com.choongang.entities.Member;
import com.choongang.repositories.MemberRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

import static org.springframework.data.domain.Sort.Order.asc;
import static org.springframework.data.domain.Sort.Order.desc;

@Slf4j
@SpringBootTest
public class JdbcEx01 {
    @Autowired
    private MemberRepository repository;

    @Test
    void test1(){
        List<Member> members = (List<Member>) repository.findAll();
        members.forEach(System.out::println);
    }

    @Test
    void test2(){
        Member member = Member.builder()
                .userNo(19L)
                .userId("user03")
                .userPw("123456")
                .userName("사용자03")
                .email("user03@test.org")
                .build();
        repository.save(member);
    }
    @Test
    void test3(){
        Member member = repository.findByUserId("user01");
        log.info(member.toString());
    }
    @Test
    void test4() {
        List<Member> members = repository.findByUserNmContainingOrUserIdContainingOrderByRegDtDesc("용", "Id");
        members.forEach(System.out::println);
    }

    @Test
    void test5() {
        List<Member> members = repository.getMembers("용", "Id");
        members.forEach(System.out::println);
    }

    @Test
    void test6() {
        Pageable pageable = PageRequest.of(0, 10, Sort.by(desc("regDt"),asc("userId")));
        Page<Member> data = repository.findByUserNmContaining("용", pageable);

        List<Member> members = data.getContent();
        long total = data.getTotalElements();
        int totalPages = data.getTotalPages();


    }

}
