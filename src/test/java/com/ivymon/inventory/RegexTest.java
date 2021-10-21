package com.ivymon.inventory;

import org.junit.jupiter.api.Test;

public class RegexTest {

    @Test
    public void test(){
        String ptAccount2 = "[a-zA-Z]+[0-9]+|[0-9]+[a-zA-Z]+";
        System.out.println("qqq111".matches(ptAccount2));
    }
}
