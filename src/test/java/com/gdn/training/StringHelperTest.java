package com.gdn.training;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("String Helper Test")
class StringHelperTest {

    @Test
    public void successConvert(){
        List<String> strings = new ArrayList<>(5);
        strings.add("ab");
        strings.add("bc");
        strings.add("zzzz");
        strings.add(null);

        List<String> result = StringHelper.toUpperCase(strings);
        System.out.println("result is " + result);
        assertEquals(3, result.size());

        for(int i = 0; i < result.size(); i++){
            assertEquals(strings.get(i).toUpperCase(), result.get(i));
        }
    }

}