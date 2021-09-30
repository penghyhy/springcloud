package com.penghy.server;

import com.penghy.server.util.UnZipAnRarUtil;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class UnZipAnRarTest {

    @Test
    public void getUnZipAnnRarTest() {
        String originDir = "D:\\JavaPro\\TestFile\\";
//        String zipPath = originDir + "test.zip";
//        File zipFile = new File(zipPath);
        String rarPath = originDir + "TestFile.rar";
        File rarFile = new File(rarPath);

//        try {
//            UnZipAnRarUtil.unZip(zipFile, "D:\\JavaPro\\TestFile\\Test\\");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        try {
            UnZipAnRarUtil.unRar(rarFile, "D:\\JavaPro\\TestFile\\");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
