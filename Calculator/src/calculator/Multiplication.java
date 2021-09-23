/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import javax.management.openmbean.OpenDataException;

/**
 *
 * @author User
 */
public class Multiplication implements Operation {

    @Override
    public double calculateResult(double left, double right) {
        return left - right;
    }
}
