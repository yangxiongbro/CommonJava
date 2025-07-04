package com.common.java.utils.math;

import com.common.java.utils.collections.CollectionsUtils;
import com.common.java.utils.math.enums.OperatorEnum;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;

/**
 * <b><code>MathUtilsTest</code></b>
 * <p/>
 * <p>
 * <p/>
 * <b>Creation Time:</b> 2024/8/16 10:43
 *
 * @author yang xiong
 * @since CommonJava 0.1.0
 */
public class MathUtilsTest {

    @Test
    public void rate(){
        System.out.println(MathUtils.rate(1, 10));
        System.out.println(MathUtils.rate(1L, 10L));
        System.out.println(MathUtils.rate(1.0, 10.0));
        System.out.println(MathUtils.rate(new BigDecimal(1), new BigDecimal(10)));
        System.out.println(MathUtils.rate(1, null));
        System.out.println(MathUtils.rate(null, 10));
    }

    @Test
    public void divide(){
        System.out.println(MathUtils.divide(1, 10));
        System.out.println(MathUtils.divide(1L, 10L));
        System.out.println(MathUtils.divide(1.0, 10.0));
        System.out.println(MathUtils.divide(new BigDecimal(1), new BigDecimal(10)));
        System.out.println(MathUtils.divide(1, null));
        System.out.println(MathUtils.divide(null, 10));
    }

    @Test
    public void judge(){
        List<OperatorEnum> list = CollectionsUtils.<OperatorEnum>listBuilder(6)
                .add(OperatorEnum.GE)
                .add(OperatorEnum.GT)
                .add(OperatorEnum.EQ)
                .add(OperatorEnum.NE)
                .add(OperatorEnum.LT)
                .add(OperatorEnum.LE)
                .build();
        for(OperatorEnum operatorEnum:list){
            System.out.println(String.format("%d %s %d %s", 10, operatorEnum.getOperator(), 10, MathUtils.judge(operatorEnum, 10, 10)));
            System.out.println(String.format("%d %s %d %s", 9, operatorEnum.getOperator(), 10, MathUtils.judge(operatorEnum, 9, 10)));
            System.out.println(String.format("%d %s %d %s", 11, operatorEnum.getOperator(), 10, MathUtils.judge(operatorEnum, 11, 10)));
            System.out.println(String.format("%d %s %d %s", null, operatorEnum.getOperator(), 10, MathUtils.judge(operatorEnum, null, 10)));
            System.out.println(String.format("%d %s %d %s", 1, operatorEnum.getOperator(), null, MathUtils.judge(operatorEnum, 1, null)));
        }
        System.out.println(MathUtils.judge(null, 1, 10));

    }

    @Test
    public void convert2Double(){
        System.out.println(MathUtils.convert2Double(1));
        System.out.println(MathUtils.convert2Double(1L));
        System.out.println(MathUtils.convert2Double(1.0));
        System.out.println(MathUtils.convert2Double(new BigDecimal(1)));
        System.out.println(MathUtils.convert2Double(null));
        System.out.println(MathUtils.convert2Double("1"));
        System.out.println(MathUtils.convert2Double(""));
        System.out.println(MathUtils.convert2Double(" "));
        System.out.println(MathUtils.convert2Double("abc"));
        System.out.println(MathUtils.convert2Double("123.456"));
        System.out.println(MathUtils.convert2Double("123a456"));
    }
}
