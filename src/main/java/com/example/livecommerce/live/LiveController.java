package com.example.livecommerce.live;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.livecommerce.configuration.ApiConfiguration;
import com.example.livecommerce.product.LiveProductRepository;

@RestController
public class LiveController {

	private LiveRepository liveRepo;
	private LiveHistoryRepository liveHistoryRepo;
	private String UserId;
	private LiveProductRepository liveProductRepo;

//	@Autowired
//	private ApiConfiguration apiConfig;

	@Autowired
	public LiveController(LiveRepository liveRepo, LiveProductRepository liveProductRepo,
			LiveHistoryRepository liveHistoryRepo) {
		this.liveRepo = liveRepo;
		this.liveProductRepo = liveProductRepo;
		this.liveHistoryRepo = liveHistoryRepo;
	}

	// live list 목록조회
	@RequestMapping(value = "/Lives", method = RequestMethod.GET)
	public List<Live> getLives(HttpServletRequest req) {
		List<Live> list = liveRepo.findAll(Sort.by("id").descending());
		return list;
	}

//	// 작성자 id로 피드 목록 조회
//	@RequestMapping(value = "/lives/search/id", method = RequestMethod.GET)
//	public List<Live> getLivesById(@RequestParam("keyword") String keyword, Long id) {
//		return liveRepo.findById(id, keyword);
//	}
//
//	// 전체 목록 조회, 페이징
//	@RequestMapping(value = "/lives/paging", method = RequestMethod.GET)
//	public List<Live> getLivesPaging(@RequestParam("page") int page, @RequestParam("size") int size) {
//		return liveRepo.findAll(PageRequest.of(page, size)).toList();
//	}
////	@RequestMapping
////	a
}
