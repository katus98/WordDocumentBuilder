package com.katus;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.Version;
import lombok.Data;
import sun.misc.BASE64Encoder;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Map;

/**
 * @author Sun Katus
 * @version 1.0, 2021-03-17
 */
@Data
public class WordUtil {
    private Configuration configure;

    public WordUtil() {
        configure = new Configuration(new Version("2.3.31"));
        configure.setDefaultEncoding("utf-8");
    }

    /**
     * 根据 Word模板生成 Word文档
     * @param dataMap 模板填充内容
     * @param inputFilePath 模板文件相对位置
     * @param outFilePath 输出文档绝对位置
     */
    public void createWord(Map<String, Object> dataMap, String inputFilePath, String outFilePath) {
        try {
            // 指定路径方式（根据某个类的相对路径指定）
            configure.setDirectoryForTemplateLoading(new File(this.getClass().getResource("/").toURI().getPath()));
            // 以utf-8的编码读取ftl文件
            Template template = configure.getTemplate(inputFilePath, "utf-8");
            Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outFilePath), StandardCharsets.UTF_8), 10240);
            template.process(dataMap, out);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 将图片转换成二进制字符串
     * @param imgFilePath 图片的绝对路径
     * @return 图片的二进制字符串
     */
    public String getImageStr(String imgFilePath) {
        InputStream in;
        byte[] data = null;
        try {
            in = new FileInputStream(imgFilePath);
            data = new byte[in.available()];
            in.read(data);
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        BASE64Encoder encoder = new BASE64Encoder();
        return encoder.encode(data);
    }
}
