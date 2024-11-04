package com.smsl.mbti_world.repository;

import com.smsl.mbti_world.domain.TestBoard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestBoardRepository extends JpaRepository<TestBoard, Long> {
}
