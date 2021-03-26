package com.katus.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Sun Katus
 * @version 1.0, 2021-03-18
 */
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Param {
    private String name;
    private String datatype;
    private String description;
    private String defaultValue;
    private String source;
    private String in, out;

    public Param(String name, String datatype, String description, String defaultValue) {
        this.name = name;
        this.datatype = datatype;
        this.description = description;
        this.defaultValue = defaultValue;
    }
}
