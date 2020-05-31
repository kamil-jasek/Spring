package com.clockworkjava.kursspring;

import com.clockworkjava.kursspring.domain.Castle;
import com.clockworkjava.kursspring.domain.Knight;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
class KursspringApplicationTests {


	@Autowired
	Knight knight;
	@Autowired
	Castle castle;

	@Test
	void contextLoads() {
	}

	@Test
	void testCastle(){
		String except ="Znajduje się zamek o nazwie Castle Black zamieszkały przez rycerza Rycerz o imieniu  lancelot (29) . Ma za zadanie: Uratuj księżniczkę";
		Assertions.assertEquals(except, castle.toString());




	}


}
