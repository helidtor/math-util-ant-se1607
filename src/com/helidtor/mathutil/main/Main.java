/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helidtor.mathutil.main;

import com.helidtor.mathutil.core.MathUtil;

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Test Case #1: n = 0; getFactorial(0) -> expected value == 1
        long expected = 1;
        long actual = MathUtil.getFactorial(0);
        System.out.println("0! status: expected = " + expected
                                    + "; actual = " + actual);
        
        //Test Case #2: n = 1; getFactorial(1) -> expected value == 1
        System.out.println("1! status: expected = 1"
                                    + "; actual = " + MathUtil.getFactorial(1));
        
        //Test Case #3: n = 5; getFactorial(5) -> expected value == 120
        System.out.println("5! status: expected = 120"
                                    + "; actual = " + MathUtil.getFactorial(5));
        
        //Test Case #4: n = -5; getFactorial(-5) -> expected value: invalid input
//        System.out.println("5! status: expected value: EXCEPTION"
//                                    + "; actual = " + MathUtil.getFactorial(-5));
        //NẾU CÓ EXCEPTION XẢY RA -> GOOD VÌ HÀM CHẠY ĐÚNG VỚI EXPECTED
        
        System.out.println("5! status: expected value: EXCEPTION"
                                    + "; actual = ");
        MathUtil.getFactorial(-5);
        
    }
    
}
// VIỆC CHẠY BỘ TEST/ XEM TỪNG DÒNG KẾT QUẢ ĐƯỢC IN RA, ĐỂ SUY LUẬN
// SO SÁNH, ĐỂ KẾT LUẬN HÀM ĐÚNG SAI -> MẤT SỨC
// VÌ PHẢI DÙNG MẮT + SUY LUẬN -> MANUAL TEST, RẤT CẢM GIÁC THỦ CÔNG
// SẼ KO HIỆU QUẢ NẾU CODE ĐƯỢC CHỈNH SỬA VÀ TA PHẢI LUẬN LẠI KẾT QUẢ BẰNG
// CÁCH THỦ CÔNG: MẮT QUÉT QUA KẾT QUẢ, TỰ SO SÁNH, TỰ KẾT LUẬN

// KỸ THUẬT THỨ 2 XUẤT HIỆN: TEST AUTOMATION
// VẪN CHẠY BỘ TEST THỦ CÔNG NHƯNG KO CẦN DÒ TỪNG KẾT QUẢ ĐỂ SO SÁNH, MÁY SO SÁNH VÀ KL DÙM LUÔN
// TA CHỈ CẦN NHÌN HAI MÀU XANH ĐỎ SAU KHI CHẠY 1 ĐÁM TEST CASE
//