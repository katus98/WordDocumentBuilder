package com.katus.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Sun Katus
 * @version 1.0, 2021-03-22
 */
@AllArgsConstructor
@Data
public class Image {
    private Integer id;
    private String ext;
    private String type;
    private String binary;
}
