package com.people.todolist.ws.converter;

import com.people.todolist.utils.enumeration.StatusEnum;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class IdToStatusConverter implements Converter<String, StatusEnum> {
    @Override
    public StatusEnum convert(String source) {
        return StatusEnum.getById(Integer.parseInt(source));
    }
}