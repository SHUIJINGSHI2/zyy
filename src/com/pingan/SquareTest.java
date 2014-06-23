package com.pingan;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class SquareTest {
	private static Calculator calculator = new Calculator();
	private int param;
	private int result;

	@Parameters
	public static Collection data() {
		return Arrays.asList(new Object[][] { { 2, 4 }, { 0, 0 }, { -3, 9 }, });
	}

	// ���캯�����Ա������г�ʼ��
	public SquareTest(int param, int result) {
		this.param = param;
		this.result = result;
	}

	@Test
	public void square() {
		calculator.square(param);
		assertEquals(result, calculator.getResult());
	}
}