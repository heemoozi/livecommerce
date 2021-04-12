package com.example.livecommerce.live;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LiveRepository

		extends JpaRepository<Live, Long> {
	public List<Live> findByCategory(Long id, String category);
}
