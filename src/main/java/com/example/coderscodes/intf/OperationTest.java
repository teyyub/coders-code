package com.example.coderscodes.intf;

import java.util.ArrayList;
import java.util.List;

public class OperationTest {
    Operation operation = new Operation();

    public static void main(String[] args) {
//            int sum = new Operation().add(2,3);
//            int subtr = new Operation().subtruct(4,3);
//            int mul = new Operation().mul(4,3);
//            int div = new Operation().div(4,3);
//
            Operations op = new Add();
            op.operate(4,5);

            Operations op1 = new Mul();
            op1.operate(4,5);

            List<Operations> operationsList = new ArrayList<>();
            operationsList.add(op);
            operationsList.add(op1);

    }
}
