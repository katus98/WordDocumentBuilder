package com.katus.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 模型效率测试内容
 * @author Sun Katus
 * @version 1.0, 2021-03-31
 */
@AllArgsConstructor
@Data
public class EfficiencyTest {
    private String complexity;
    private String dataLevel;
    private String computingTime;
    private String other;

    public EfficiencyTest() {
        this.complexity = "";
        this.dataLevel = "";
        this.computingTime = "";
        this.other = "";
    }
}
