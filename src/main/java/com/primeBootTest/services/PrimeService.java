package com.primeBootTest.services;

import org.springframework.stereotype.Service;

@Service
public class PrimeService implements IPrimeService {

	@Override
	public boolean isPrime(int number) {
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

}
