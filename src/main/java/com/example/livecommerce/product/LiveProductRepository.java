package com.example.livecommerce.product;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LiveProductRepository extends JpaRepository<LiveProduct, Long> {
	List<LiveProduct> findByLiveId(long LiveId);
}
