package com.katus;

import com.katus.entity.*;

import java.util.*;

/**
 * @author Sun Katus
 * @version 1.0, 2021-03-17
 */
public class Main {
    public static void main(String[] args) {
        WordUtil wordUtil = new WordUtil();
        Map<String, Object> dataMap = new HashMap<>();

        dataMap.put("name", "skr");
        // 1 基本信息
        dataMap.put("writerId", "katus");
        dataMap.put("authorId", "katus");
        dataMap.put("codeProcess", "编码完成");
        dataMap.put("testProcess", "测试完成");
        dataMap.put("versionId", null);
        dataMap.put("modifyInfo", "没什么好说的，膜就完事了！");
        dataMap.put("modifyDate", "2021-3-17");
        dataMap.put("developmentDate", "2021-3-17");
        // 2 算法描述
        dataMap.put("meaning", "意义重大");
        dataMap.put("algo", "神");
        dataMap.put("theory", "难以描述");
        List<Paper> paperList = new ArrayList<>();
        paperList.add(new Paper("第一篇文献"));
        paperList.add(new Paper("第二篇文献"));
        dataMap.put("paperList", paperList);
        // 3 输入输出数据描述
        // 3.1 接口形式
        dataMap.put("artifactId", "FinalModel");
        List<Param> paramList = new ArrayList<>();
        paramList.add(new Param("par1", "csv", "不太清楚1", "file.csv"));
        paramList.add(new Param("par2", "txt", "不太清楚2", "file.txt"));
        paramList.add(new Param("par3", "number", "不太清楚3", "0"));
        StringBuilder paramsForm = new StringBuilder(paramList.size() > 0 ? paramList.get(0).getName() : "");
        for (int i = 1; i < paramList.size(); i++) {
            paramsForm.append(", ").append(paramList.get(i).getName());
        }
        dataMap.put("paramsForm", paramsForm.toString());
        dataMap.put("paramList", paramList);
        // 3.2 输入参数
        List<PutUnit> inList = new ArrayList<>();
        List<Field> fields1 = new ArrayList<>();
        fields1.add(new Field("name11", "type11", "des11"));
        fields1.add(new Field("name12", "type12", "des12"));
        fields1.add(new Field("name13", "type13", "des13"));
        List<List<String>> example1 = new ArrayList<>();
        example1.add(new ArrayList<>(Arrays.asList("xxx", "yyy", "zzz")));
        example1.add(new ArrayList<>(Arrays.asList("aaa", "bbb", "ccc")));
        inList.add(new PutUnit("in1", "不知道好说什么1", fields1, example1));
        List<Field> fields2 = new ArrayList<>();
        fields2.add(new Field("name21", "type21", "des21"));
        fields2.add(new Field("name22", "type22", "des22"));
        fields2.add(new Field("name23", "type23", "des23"));
        List<List<String>> example2 = new ArrayList<>();
        example2.add(new ArrayList<>(Arrays.asList("qq", "ww")));
        example2.add(new ArrayList<>(Arrays.asList("gg", "hh")));
        example2.add(new ArrayList<>(Arrays.asList("oo", "ff")));
        inList.add(new PutUnit("in2", "不知道好说什么2", fields2, example2));
        dataMap.put("inList", inList);
        // 3.3 输出参数
        List<PutUnit> outList = new ArrayList<>();
        outList.add(new PutUnit("out1", "???", fields2, example1));
        dataMap.put("outList", outList);
        // 4 调用其他接口描述
        dataMap.put("interfaces", "其他接口不知道啊");
        // 5 测试案例说明
        dataMap.put("caseDescription", "这里有个事情需要说明");
        List<CaseData> caseDataList = new ArrayList<>();
        caseDataList.add(new CaseData("c1", "/file1", "des1", example1));
        caseDataList.add(new CaseData("c2", "/db2", "des2", example2));
        dataMap.put("caseDataList", caseDataList);
        List<Image> imageList = new ArrayList<>();
        imageList.add(new Image(1, "png", "png", wordUtil.getImageStr("D:\\Pictures\\Saved Pictures\\71394986_0.png")));
        imageList.add(new Image(2, "jpg", "jpg", wordUtil.getImageStr("D:\\Pictures\\Saved Pictures\\83088427_0.jpg")));
        imageList.add(new Image(3, "jpg", "jpg", wordUtil.getImageStr("D:\\Pictures\\Saved Pictures\\83316513_p0.jpg")));
        dataMap.put("imageList", imageList);
        // 6 算法功能性测试
        dataMap.put("testRequirements", "歪比歪比");
        dataMap.put("efficiencyTestList", new ArrayList<>(Arrays.asList(new Test("e1"), new Test("e2"))));
        dataMap.put("precisionTestList", new ArrayList<>(Arrays.asList(new Test("p1"), new Test("p2"))));
        dataMap.put("type", "一般类型");
        dataMap.put("specificType", "聚合");
        dataMap.put("ifPassed", "通过");
        dataMap.put("requirement", "好像有很多，但是我忘了");
        dataMap.put("testDescription", "测试没什么好描述的");
        dataMap.put("result", "超强的结果");

        wordUtil.createWord(dataMap, "AT.ftl", "D:/Data/Words/AT04.doc");
    }
}
