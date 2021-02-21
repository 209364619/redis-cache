package com.hph.cache;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.SimpleDateFormat;
import java.util.Date;

//@SpringBootTest
class RedisCacheApplicationTests {

	@Test
	void contextLoads() {
		Date date = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		System.out.println(simpleDateFormat.format(date));
	}

}
