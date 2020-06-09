package com.example.damian.util;

import org.apache.commons.lang3.ArrayUtils;
import org.springframework.stereotype.Component;

@Component
public class MyUtil {
    public String sayHi(String name) {
        int[] oldArray = { 2, 3, 4, 5 };
        int[] newArray = ArrayUtils.add(oldArray, 0, 1);

        return newArray.toString();
    }
}
