package com.xxxx.server.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author : liyangyang
 * @date :2021/7/18/018 23:41
 * @description :日期转换
 * @ClassName: Converter
 **/
@Component
public class DateConverter implements Converter<String, LocalDate> {

    @Override
    public LocalDate convert(String source) {
        try {
//            return LocalDate.parse(source, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            return LocalDate.parse(source, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }
}
