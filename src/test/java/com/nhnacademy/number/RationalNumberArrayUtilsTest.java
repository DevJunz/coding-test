package com.nhnacademy.number;

import com.nhnacademy.number.impl.RationalNumber;
import com.nhnacademy.util.RationalNumberArrayUtils;
import org.junit.jupiter.api.*;

import java.util.List;

@TestMethodOrder(value = MethodOrderer.OrderAnnotation.class)
class RationalNumberArrayUtilsTest {

    @Test
    @Order(1)
    @DisplayName("3.1 정렬 (5점)")
    void sort() {

        List<MyNumber> myNumbers = List.of(
            new RationalNumber(5),
            new RationalNumber(4),
            new RationalNumber(3,3),
            new RationalNumber(2),
            new RationalNumber(4,10)
        );

        List<MyNumber> expected = List.of(
                new RationalNumber(4,10),
                new RationalNumber(3,3),
                new RationalNumber(2),
                new RationalNumber(4),
                new RationalNumber(5)
        );

        List<MyNumber> actual = RationalNumberArrayUtils.sort(myNumbers);
        Assertions.assertEquals(expected,actual);

    }


    @Test
    @Order(2)
    @DisplayName("3.2 합 (5점)")
    void sum() {
        List<MyNumber> myNumbers = List.of(
                new RationalNumber(5),
                new RationalNumber(4),
                new RationalNumber(3,3),
                new RationalNumber(2),
                new RationalNumber(10,2)
        );

        MyNumber actual = RationalNumberArrayUtils.sum(myNumbers);
        Assertions.assertEquals(new RationalNumber(17),actual);
    }

    @Test
    @Order(3)
    @DisplayName("3.3 양의 합 (5점)")
    void sumOfPositive() {

        List<MyNumber> myNumbers = List.of(
                new RationalNumber(-5),
                new RationalNumber(4),
                new RationalNumber(3,3),
                new RationalNumber(-2),
                new RationalNumber(10,2)
        );

        MyNumber actual = RationalNumberArrayUtils.sumOfPositive(myNumbers);
        Assertions.assertEquals(new RationalNumber(10),actual);
    }
}