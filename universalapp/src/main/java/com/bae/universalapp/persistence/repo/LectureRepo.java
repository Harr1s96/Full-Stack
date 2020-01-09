package com.bae.universalapp.persistence.repo;

import com.bae.universalapp.persistence.domain.Lecture;
// import com.bae.universalapp.service.LectureListWrapper;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * LectureRepo
 */
@Repository
public interface LectureRepo extends JpaRepository<Lecture, Long> {

    // LectureListWrapper saveAll(LectureListWrapper lectureList);

}