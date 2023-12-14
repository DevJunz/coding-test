package com.nhnacademy.number;

import com.nhnacademy.number.impl.RationalNumber;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;
@Slf4j
@TestMethodOrder(value = MethodOrderer.OrderAnnotation.class)
class RationalNumberTest {

    @Test
    @Order(1)
    @DisplayName("1-1. 유리수는 정수를 받아 생성할 수 있습니다. (2점)")
    void createRationalNumber(){
        RationalNumber newRn = new RationalNumber(100);
        log.info("{}",newRn);
        Assertions.assertEquals("100",newRn);
    }

    @Test
    @Order(2)
    @DisplayName("1-2. 유리수는 정수 분자와 정수 분모를 받아 생성할 수 있습니다. (2점)")
    void createRationNumber2Params(){
        RationalNumber newRn = new RationalNumber(2,3);
        log.info("{}",newRn);
        Assertions.assertEquals("2/3",newRn);
    }

    @Test
    @Order(3)
    @DisplayName("1-3. 유리수는 유리수를 받아 생성할 수 있습니다. (2점)")
    void createRationNumberByRn(){
        RationalNumber newRn = new RationalNumber(new RationalNumber(2,3));
        log.info("{}",newRn);
        Assertions.assertEquals("2/3",newRn);
    }

    @Test
    @Order(4)
    @DisplayName("1-4. 유리수가 정수인 경우, 정수로 출력합니다. (2점)")
    void createRationNumberByInt(){
        RationalNumber newRn = new RationalNumber(100, 4);
        log.info("{}",newRn);
        Assertions.assertEquals("25",newRn);
    }

    @Test
    @Order(5)
    @DisplayName("1-5. 유리수가 분수인 경우, 기약 분수로 출력합니다. (2점)")
    void createRationNumberByReducedFraction(){
        RationalNumber newRn = new RationalNumber(8, 6);
        log.info("{}",newRn);
        Assertions.assertEquals("4/3",newRn);
    }

}