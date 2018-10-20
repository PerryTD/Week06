package edu.dmacc.coma502.homework;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CustomerTest {
	
	@Test
	public void testRewardNotEarned() {
		Customer customer = new Customer();
		customer.makePurchase(50.50);
		assertFalse(customer.discountReached());
	}
	
	@Test
	public void testOneRewardEarned() {
		Customer customer = new Customer();
		customer.makePurchase(10.50);
		customer.makePurchase(10.50);
		customer.makePurchase(10.50);
		customer.makePurchase(10.50);
		customer.makePurchase(10.50);
		customer.makePurchase(10.50);
		customer.makePurchase(10.50);
		customer.makePurchase(10.50);
		customer.makePurchase(10.50);
		customer.makePurchase(10.50);
		assertTrue(customer.discountReached());
	}
	
	@Test
	public void testStillOnlyOneRewardEarned() {
		Customer customer = new Customer();
		customer.makePurchase(10.50);
		customer.makePurchase(10.50);
		customer.makePurchase(10.50);
		customer.makePurchase(10.50);
		customer.makePurchase(10.50);
		customer.makePurchase(10.50);
		customer.makePurchase(10.50);
		customer.makePurchase(10.50);
		customer.makePurchase(10.50);
		customer.makePurchase(10.50);
		customer.makePurchase(100.50);
		assertTrue(customer.discountReached());
	}
}
