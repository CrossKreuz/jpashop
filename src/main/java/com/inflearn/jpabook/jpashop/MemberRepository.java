package com.inflearn.jpabook.jpashop;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class MemberRepository {

    @PersistenceContext
    private EntityManager em;

    public Long save(Member member) {
        em.persist(member);
        return member.getId();
    }
//    왜 Long을 반환하였을까? 멤버 반환이 아니라?
    /**
     * 이건 약간 영한쌤 스타일인데, 직접적으로 db를 건드리는 것은 return을 받지 않는 것이 옳음
     * 그래서 member를 반환하지 않는 것(db 직접 조회가 될 수 있기 떄문에)
     * 하지만 id 정도 반환하면, 나중에 다시 조회할 수 있음
     */
}
