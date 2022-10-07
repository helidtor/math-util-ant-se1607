/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helidtor.mathutil.core;

import org.junit.Assert;
import org.junit.Test;

public class MathUtilTest {
    // framework ép dev phải viết code theo 1 khung dựng sẵn
    // thường được ký hiệu bằng @..., annotation - flag đánh dấu 1 điều gì đó
    // lúc biên dịch, lúc runtime

    @Test //test thử hàm so sánh 2 giá trị expected và actual
    // này tự so sánh giúp luôn, mình ko cần nhìn bằng mắt
    // nhìn bên hàm main() dùng sout()
    // mà FW JUnit tự generate ra code so sánh giá trị,
    // tự dùng bảng màu xanh, đỏ mang ý nghĩa PASSED, FAILED
    // @Test là 1 ký hiệu annotation báo với JUnit và JVM
    // để generate ra hàm tryAssert() thành hàm main() truyền thống
    // và gửi cho JVM để chạy. App chạy từ main()
    // thiếu @Test tương đương app thiếu hàm main() no run-able method
    
    //Chốt deal xanh đỏ:
    //Nếu tất cả test case. @Test đều xanh -> kết luận hàm đúng
    //cho những thứ mình đã test
    
    //Nếu trong các @Test có ít nhất 1 đỏ thì xem như tất cả là đỏ
    // => hàm sai
    
    //Đỏ đến từ 1 trong 2 tình huống:
    //+ Expected đúng, Actual trả về sai -> Bug của hàm
    //+ Expected sai/gõ sai, Actual sai đúng
    public void tryAssert() {
        Assert.assertEquals(100, 100);
    }

    //test hàm getFactorial() nhà mình, như bên main() nhưng chơi kiểu xanh đỏ
    @Test //quy tắc đặt tên hàm dành cho việc kiểm thử
    //tên hàm bao hàm ngữ nghĩa của việc kiểm thử
    //test này kiểm tra tính giai thừa với tham số tử tế 0->20
    public void testFactorialGivenRightArrgumentReturnsWell() {
        //Test case #1: n = 0, 0! hy vọng trả về 1, thực tế hàm trả về mấy
        //chạy mới biết
        long expected = 1;
        long actual = MathUtil.getFactorial(0);

        Assert.assertEquals(expected, actual);

        //Test case #2: n = 1, 1! hy vọng trả về 1
        Assert.assertEquals(1, MathUtil.getFactorial(1));

        //Test case #3: n = 2, 1! hy vọng trả về 2
        Assert.assertEquals(2, MathUtil.getFactorial(2));
    }
    
    @Test
    public void testFactorialGivenRightArrgumentReturnsWell2() {
        //Test case #4: n = 3, 1! hy vọng trả về 6
        Assert.assertEquals(6, MathUtil.getFactorial(3));

        //Test case #5: n = 4, 4! hy vọng trả về 24
        Assert.assertEquals(24, MathUtil.getFactorial(4));
    }
    
    
    //Kiểm thử ngoại lệ khi đưa data sai!!!
    //n < 0, hàm ko tính giai thừa âm
    //n > 20, hàm ko tính giai thừa tràn kiểu long
    //hàm được thiết kế, NÉM RA NGOẠI LỆ TÊN LÀ Illegal-Argument-Exception
    //THAY VÌ NHẬN MỘT GIÁ TRỊ LONG, BẠN NHẬN VỀ 1 CÂU NGOẠI LỆ => MỪNG RƠI NƯỚC MẮT
    
    //NẾU -5 mà app ném ra ngoại lệ IllegalArgumentException
    //nghĩa là HÀM ỔN, CHẠY NHƯ THIẾT KẾ, NHƯ KỲ VỌNG
    //VẬY NGHĨA LÀ HÀM PASSED MÀU XANH!!
    //ĐÚNG KỲ VỌNG --- MÀU XANH
    
    @Test(expected = IllegalArgumentException.class)
    public void testFactorialGivenWrongArgumentThrowsException() {
        MathUtil.getFactorial(-5);
        
        //Test case #6: n = -5, expected: hy vọng thấy ngoại lệ
        //tên là IllegalArrgynebtException
    }
}
