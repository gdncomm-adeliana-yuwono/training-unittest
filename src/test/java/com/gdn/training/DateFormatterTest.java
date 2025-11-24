package com.gdn.training;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Date Formatter Test")
class DateFormatterTest {

    @Test
    @DisplayName("Date format is null")
    public void dateFormatted(){
        assertThrows(IllegalArgumentException.class,
                () -> DateFormatter.getFormattedYearMonth(null));
    }

    @Test
    @DisplayName("Date format must be as yyyy-MM")
    public void dateFormatSuccess(){
        Date fixedDate = new Date(0);
        String result = DateFormatter.getFormattedYearMonth(fixedDate);
        assertEquals("1970-01", result);
    }

}