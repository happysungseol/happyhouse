package com.ssafy.vue.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.ssafy.vue.dto.Store;
import com.ssafy.vue.service.StoreService;

import io.swagger.annotations.ApiOperation;


@RestController
@RequestMapping("/store")
public class StoreController {
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	private static final String SUCCESS = "success";
	private static final String FAIL = "fail";
	
	@Autowired
	StoreService storeService;
	 @ApiOperation(value = "상권목록", notes = "서울상권 정보를 반환한다.", response = List.class)
	 @GetMapping
		public ResponseEntity<List<Store>> retrieveStore() throws Exception {
			logger.debug("retrieveStore - 호출");
			return new ResponseEntity<List<Store>>(storeService.retrieveStore(), HttpStatus.OK);
		}
	
}
