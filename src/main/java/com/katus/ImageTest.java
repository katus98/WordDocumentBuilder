package com.katus;

import com.katus.entity.Image;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Sun Katus
 * @version 1.0, 2021-03-22
 */
public class ImageTest {
    public static void main(String[] args) {
        WordUtil wordUtil = new WordUtil();
        Map<String, Object> dataMap = new HashMap<>();
        List<Image> imageList = new ArrayList<>();
        imageList.add(new Image(1, "png", "png", wordUtil.getImageStr("D:\\Pictures\\Saved Pictures\\71394986_0.png")));
        imageList.add(new Image(2, "jpg", "jpeg", wordUtil.getImageStr("D:\\Pictures\\Saved Pictures\\83088427_0.jpg")));
        imageList.add(new Image(3, "jpg", "jpeg", wordUtil.getImageStr("D:\\Pictures\\Saved Pictures\\83316513_p0.jpg")));
        dataMap.put("imageList", imageList);
        wordUtil.createWord(dataMap, "picsT.ftl", "D:/Data/Words/imageTest.doc");
    }
}
