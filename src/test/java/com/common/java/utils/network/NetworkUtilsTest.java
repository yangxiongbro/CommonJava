package com.common.java.utils.network;

import com.common.java.utils.collections.CollectionsUtils;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;

/**
 * <b><code>NetworkUtils</code></b>
 * <p/>
 * <p>
 * <p/>
 * <b>Creation Time:</b> 2024/8/15 15:59
 *
 * @author yang xiong
 * @since CommonJava 0.1.0
 */
public class NetworkUtilsTest {
    private List<String> list = CollectionsUtils.<String>listBuilder(10)
            .add("0.0.0.0")
            .add("255.255.255.255")
            .add("10.253.98.210")
            .add("10.253.98.")
            .add("10")
            .add("  ")
            .add("")
            .add("null")
            .add(null)
            .build();

    private List<String> hexList = CollectionsUtils.<String>listBuilder(10)
            .add("0")
            .add("ffffffff")
            .add("afd62d2")
            .add("  ")
            .add("")
            .add("null")
            .add(null)
            .build();

    private List<Long> decLongList = CollectionsUtils.<Long>listBuilder(10)
            .add(0L)
            .add(4294967295L)
            .add(184378066L)
            .add(null)
            .build();

    private List<BigDecimal> decList = CollectionsUtils.<BigDecimal>listBuilder(10)
            .add(new BigDecimal(0))
            .add(new BigDecimal(4294967295L))
            .add(new BigDecimal(184378066))
            .add(new BigDecimal(123.123))
            .add(null)
            .build();


    @Test
    public void hex2FormatIp(){
        for(String hexIp:hexList){
            System.out.println(NetworkUtils.hex2FormatIp(hexIp));
        }
    }

    @Test
    public void dec2FormatIp(){
        for(Long decIp:decLongList){
            System.out.println(NetworkUtils.dec2FormatIp(decIp));
        }
        for(BigDecimal decIp:decList){
            System.out.println(NetworkUtils.dec2FormatIp(decIp));
        }
    }

    @Test
    public void formatIp2Hex(){
        for(String formatIp:list){
            System.out.println(NetworkUtils.formatIp2Hex(formatIp));
        }
    }

    @Test
    public void formatIp2Dec(){
        for(String formatIp:list){
            System.out.println(NetworkUtils.formatIp2Dec(formatIp));
        }
    }
}
