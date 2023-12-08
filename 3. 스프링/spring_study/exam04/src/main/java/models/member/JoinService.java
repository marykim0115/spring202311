package models.member;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JoinService { // 빈의 이름 joinService

    private MemberDAO memberDao;
    @NonNull
    private JoinValidator validator;


    public void join(Member member) {
        // 데이터 검증
        validator.validate(member);

        // 데이터 추가
        memberDao.register(member);
    }
}

