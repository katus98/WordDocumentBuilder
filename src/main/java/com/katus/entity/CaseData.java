package com.katus.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * @author Sun Katus
 * @version 1.0, 2021-03-22
 */
@AllArgsConstructor
@Data
public class CaseData {
    private String name;
    private String storage;
    private String description;
    private List<List<String>> example;
}
