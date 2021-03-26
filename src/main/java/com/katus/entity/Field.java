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
public class Field {
    private String defaultValue;
    private String datatype;
    private String name;
    private String description;
    private Boolean required;

    public Field(String name, String datatype, String description) {
        this.name = name;
        this.datatype = datatype;
        this.description = description;
    }
}
