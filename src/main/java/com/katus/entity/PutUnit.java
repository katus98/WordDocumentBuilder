package com.katus.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author Sun Katus
 * @version 1.0, 2021-03-18
 */
@AllArgsConstructor
@Data
@NoArgsConstructor
public class PutUnit {
    private String name;
    private String description;
    private String path;
    private String type;
    private List<Field> fields;
    private List<List<String>> example;

    public PutUnit(String name, String description, List<Field> fields, List<List<String>> example) {
        this.name = name;
        this.description = description;
        this.fields = fields;
        this.example = example;
    }
}
