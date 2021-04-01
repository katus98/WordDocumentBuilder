package com.katus.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 模型精度测试内容
 * @author Sun Katus
 * @version 1.0, 2021-03-31
 */
@AllArgsConstructor
@Data
public class PrecisionTest {
    private String method;
    private String dataDescription;
    private String TP, FP, TN, FN, Recall, Precision;

    public PrecisionTest() {
        this.method = "";
        this.dataDescription = "";
        this.TP = "";
        this.FP = "";
        this.TN = "";
        this.FN = "";
        this.Recall = "";
        this.Precision = "";
    }
}
