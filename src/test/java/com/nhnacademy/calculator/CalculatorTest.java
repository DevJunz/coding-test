package com.nhnacademy.calculator;

import com.nhnacademy.number.MyNumber;
import com.nhnacademy.number.impl.MyInteger;
import com.nhnacademy.number.impl.RationalNumber;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@TestMethodOrder(value = MethodOrderer.OrderAnnotation.class)
class CalculatorTest {
    @Order(1)
    @Test
    @DisplayName("4-1. 문자열 수식을 받아 형태소 단위로 분리합니다. (15점)")
    void parsing() {
        String expression = "3 * 2 + ( 4 / 5 * -2)";
        List<String> expected = List.of("3","*","2","+","(","4","/","5","*","-2",")");
        List<String> actual = Calculator.parsing(expression);
        log.info("{}",actual);

        Assertions.assertEquals(expected,actual);
    }

    @Order(2)
    @DisplayName("4-2. RPN 계산기 입력 가능 형태로 만들어 봅니다. (15점)")
    @Test
    void infixToPostfix() {
        String expression = "3 * 2 + ( 4 / 5 * -2)";
        List<String> expected = List.of("3", "2", "*", "4", "5", "/", "-2", "*", "+");
        List<String> actual = Calculator.infixToPostfix(Calculator.parsing(expression));
        log.info("{}", actual);
        Assertions.assertEquals(expected,actual);
    }

    @Order(3)
    @DisplayName("4-3. RPN 계산기를 만들어 봅니다. (15점)")
    @Test
    void run() {
        String expression = "3 * 2 + ( 4 / 5 * -2)";
        MyNumber expected = new MyInteger(6);
        MyNumber actual = Calculator.run(expression);
        log.info("{}",actual);
        Assertions.assertEquals(expected,actual);
    }

    @Order(4)
    @DisplayName("5-1. Calculator class에서 RationalNumber도 처리 가능하도록 수정합니다. (20 점)")
    @Test
    void runByRationalNumber(){
        String expression = "[5,3] * [3,5] + ( [-4,2] * [1,4] )";
        MyNumber expected = new RationalNumber(1,2);
        MyNumber actual = Calculator.run(expression);
        Assertions.assertEquals(expected,actual);
    }
}