package com.smsl.mbti_world.repository;

import com.smsl.mbti_world.domain.TestBoard;
import jakarta.persistence.EntityManager;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
@ActiveProfiles("test")
public class TestBoardRepositoryTest {

    @Autowired
    private EntityManager em;

    @Test
    @DisplayName("Save")
    void 저장() {
        // given
        TestBoard board = TestBoard.builder()
                .title("제목")
                .description("내용")
                .build();
        // when
        em.persist(board);
        TestBoard result = em.createQuery("select b from TestBoard b where b.id =: id", TestBoard.class)
                .setParameter("id", board.getId())
                .getSingleResult();
        // then
        Assertions.assertThat(board.getId()).isEqualTo(result.getId());
    }
}
