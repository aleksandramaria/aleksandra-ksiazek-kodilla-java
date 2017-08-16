package com.kodilla.spring.calculator;

import com.kodilla.spring.forum.ForumUser;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculations(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double resultOfAdd = calculator.add(2, 4);
        double resultOfSub = calculator.sub(10, 5);
        double resultOfMul = calculator.mul(4,4);
        double resultOfDiv = calculator.div(24,6);
        //Then
        Assert.assertEquals(6.0, resultOfAdd,0);
        Assert.assertEquals(5.0, resultOfSub, 0);
        Assert.assertEquals(16.0, resultOfMul, 0);
        Assert.assertEquals(4.0, resultOfDiv, 0);
    }
}
