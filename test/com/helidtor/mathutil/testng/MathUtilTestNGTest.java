/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helidtor.mathutil.testng;

import com.helidtor.mathutil.core.MathUtil;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 *
 * @author Admin
 */
public class MathUtilTestNGTest {
    @Test
    public MathUtilTestNGTest() {
        long expected = 1;
        long actual = MathUtil.getFactorial(0);
        Assert.assertEquals(actual, expected);
        
        Assert.assertEquals(4, MathUtil.getFactorial(2));
    }
}
