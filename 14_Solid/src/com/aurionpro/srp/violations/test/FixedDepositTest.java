package com.aurionpro.srp.violations.test;

import com.aurionpro.srp.violations.model.FestivalType;
import com.aurionpro.srp.violations.model.FixedDeposit;

public class FixedDepositTest {

	public static void main(String[] args) {
		FixedDeposit fixedDeposit = new FixedDeposit(1234, "Nishank", 40000, 2, FestivalType.NEWYEAR);
		FixedDeposit fixedDeposit2 = new FixedDeposit(456, "abc", 45000, 5, FestivalType.DIWALI);
		FixedDeposit fixedDeposit3 = new FixedDeposit(789, "abcc", 67000, 5, FestivalType.HOLI);
		FixedDeposit fixedDeposit4 = new FixedDeposit(1466, "Swabhav", 45600, 6, FestivalType.OTHERS);
		
		
		System.out.println(fixedDeposit.calculateSimpleInterest());
		System.out.println(fixedDeposit2.calculateSimpleInterest());
		System.out.println(fixedDeposit3.calculateSimpleInterest());
		System.out.println(fixedDeposit4.calculateSimpleInterest());
		
	}

}
