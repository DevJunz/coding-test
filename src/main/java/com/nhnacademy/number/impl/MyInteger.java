package com.nhnacademy.number.impl;

import com.nhnacademy.number.MyNumber;

import javax.naming.OperationNotSupportedException;

public class MyInteger implements MyNumber {

    public MyInteger(int n) {
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
