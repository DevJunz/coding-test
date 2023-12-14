package com.nhnacademy.number.impl;

import com.nhnacademy.number.MyNumber;

import javax.naming.OperationNotSupportedException;

public class RationalNumber implements MyNumber {

    public RationalNumber(int n) {
    }

    public RationalNumber(int n1, int n2) {
    }

    public RationalNumber(MyNumber operand) {
    }

    @Override
    public MyNumber plus(MyNumber operand) throws OperationNotSupportedException {
        return null;
    }

    @Override
    public MyNumber minus(MyNumber operand) throws OperationNotSupportedException {
        return null;
    }

    @Override
    public MyNumber multipliedBy(MyNumber operand) throws OperationNotSupportedException {
        return null;
    }

    @Override
    public MyNumber divideBy(MyNumber operand) throws OperationNotSupportedException {
        return null;
    }

}
