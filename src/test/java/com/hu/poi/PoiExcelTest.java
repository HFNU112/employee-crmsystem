package com.hu.poi;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.*;

/**
 * @author: Husp
 * @date: 2023/6/12 23:00
 */
public class PoiExcelTest {

    /**
     * 从excel中读取数据
     */
    @Test
    public void test1() throws IOException {
        //新建工作簿
        XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(new File("D:\\edwarder\\poi\\员工表.xlsx")));

        //获取sheet页
        XSSFSheet sheet = workbook.getSheetAt(0);

        for (Row row : sheet) {
            for (Cell cell : row) {
                System.out.println(cell.getStringCellValue());
            }
        }
        //关闭流
        workbook.close();
    }

}
