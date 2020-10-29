package com.example.httpclient_demo.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.UUID;

/**
 * @description:
 * @author: lin.guo
 * @create: 2020-09-07 10:40
 **/
public class Test {

    public static void main(String[] args) {
        /*File dir = new File("c:/test");
        if (!dir.exists()) {
            dir.mkdirs();
        }
        File f = new File("c:" + "/test/" + "1.txt");
        try {
            RandomAccessFile accessFile = new RandomAccessFile(f,"rw");
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }*/
        System.out.println(UUID.randomUUID());
    }
}
