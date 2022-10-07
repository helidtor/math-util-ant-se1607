/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helidtor.mathutil.core;

/**
 *
 * @author Admin
 */
public class MathUtil {
    //trong class này ta sẽ viết các hàm tiện ích, dùng chung cho nhiều class khác
    //cái gì mà dùng chung cho các class khác thì thường sẽ THIẾT KẾ là STATIC
    
    //hàm này tính giai thừa n! = 1.2.3.4...n
    //quy ước: ko có giai thừa
    //  0! = 1! = 1
    //  chỉ tính n từ 0->20, vì 21! vượt quá 18 con số, vượt long
    public static long getFactorial(int n) {
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid n (n must be between 0..20)");
        
        if (n == 0 || n == 1)
            return 1;
        
        long product = 1; //biến tích lũy acc/accumulation
        for (int i = 2; i <= n; i++)
            product *= i; //product *=  i;
            
        return product;
    }
}

// học kỹ thuật viết code mới được gọi là TDD - TEST DRIVEN DEVELOPMENT
// là kỹ thuật ngay khi viết code, ngay khi đặt tên hàm/class đã phải
// chuẩn bị luôn bộ kiểm thử - chuẩn bị luôn các TEST CASE
// chuẩn bị luôn các tình huống (case) sẽ xài hàm này như thế nào
// chuẩn bị luôn tình huống test các hàm để xác định hàm đúng/sai
// viết code hướng về đảm bảo các bài kiểm thử đặt ra
// các test cases - các tình huống xài hàm 1 khi hàm viết xong

//Case #1: n = 0; getFactorial(0) -> expected value == 1
//Case #2: n = 1; getFactorial(1) -> expected value == 1
//Case #3: n = 5; getFactorial(5) -> expected value == 120
//Case #4: n = -5; getFactorial(-5) -> expected value: invalid input
//Case #5: n = 20; getFactorial(20) -> expected value: invalid input

//TEST CASE: là 1 tình huống kiểm thử app/màn hình/tính năng
//           xem nó chạy đúng hay không?
//           bằng cách đưa data cụ thể nào đó, xem nó output ra đúng dự kiến hay không
//           tức là đưa data, chờ app xử lý và so sánh kq (actual) với expected
