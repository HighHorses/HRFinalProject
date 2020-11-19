package com.hrproject.util;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 将字符串转换为日期类型
 */
public class StringToDateConverter implements Converter<String, Date> {
    @Override
    public Date convert(String dateStr) {
        String dateFormatStr="yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat(dateFormatStr);

        try {
            return simpleDateFormat.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
