package com.nhnacademy.number;

import javax.naming.OperationNotSupportedException;

public interface MyNumber {
    MyNumber plus(MyNumber operand) throws OperationNotSupportedException;
    MyNumber minus(MyNumber operand) throws OperationNotSupportedException;
    MyNumber multipliedBy(MyNumber operand) throws OperationNotSupportedException;
    MyNumber divideBy(MyNumber operand) throws OperationNotSupportedException;
}