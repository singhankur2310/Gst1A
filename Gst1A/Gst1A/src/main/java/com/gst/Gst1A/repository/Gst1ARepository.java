package com.gst.Gst1A.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gst.Gst1A.entity.Gst1A;
@Repository
public interface Gst1ARepository extends JpaRepository<Gst1A, Integer> {

}
