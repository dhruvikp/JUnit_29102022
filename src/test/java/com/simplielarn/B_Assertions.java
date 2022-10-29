package com.simplielarn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class B_Assertions {
	
	@Test
	void test() {
		String str = null;
		String str1 = "dhruvik";
		
		Assertions.assertNotSame(str, str1);
		
		Assertions.assertTrue(4>0);
		Assertions.assertFalse(4<0);
		
		Assertions.assertNull(str);
		
		String[] a1 = {"a", "b"};
		String[] a2 = {"a","b"};
		
		Assertions.assertArrayEquals(a1, a2);
	}

}
