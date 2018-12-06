package com.primeBootTest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

import com.primeBootTest.services.IPrimeService;


@Configuration
@RunWith(SpringRunner.class)
public class PrimeServiceTest {
	
	@Autowired
	private IPrimeService primeService;
	
	@Test
	public void primeTest() {
		Assert.assertTrue(primeService.isPrime(11));
	}
	
	@Test
	public void failedPrimeTest() {
		Assert.assertFalse(primeService.isPrime(4));
	}

}
