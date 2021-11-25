package com.ebookjava.repository;

import com.ebookjava.domain.EbookJava;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EbookJavaRepository extends JpaRepository< EbookJava, Long> {
}
