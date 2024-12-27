package com.visitor.visitors;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Query;
// import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface visitorRepository extends JpaRepository<visitorEntity, Integer> {
    // @Query("select v from visitors_details v where v.visitor_name=:visitor_name")
    // Visitor findByName(@Param("visitor_name") String visitor_name);
}
