package com.javase.orm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created by DD240 on 2016/11/15.
 */
public class TestMain {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
/*        @SuppressWarnings({"unchecked", "serial"})
        List<HashMap<String, String>> list = Arrays.asList(
                new HashMap<String, String>() {
                    put("name", "xieyue");
                    put("title", "xiaopang");
                },
                new HashMap<String, String>() {
                    put("name", "ffff");
                    put("title", "标题2");
                }
        );

        List<UserDao> users = new ArrayList<UserDao>(list.size());
        for(HashMap<String, String> row : list) {
            users.add(ConvertionService.convertMapToBean(row, UserDao.class));
        }*/

        @SuppressWarnings({ "unchecked", "serial" })
        List<HashMap<String , String>> list = Arrays.asList(
                new HashMap<String, String>() {
                    {
                        put("name", "xieyuooo");
                        put("title", "小胖");
                    }
                },
                new HashMap<String, String>() {
                    {
                        put("name", "ffff");
                        put("title", "标题2");
                    }
                }
        );
        List<UserDao>users = new ArrayList<UserDao>(list.size());
        for(HashMap<String , String> row : list) {
            users.add(ConvertionService.convertMapToBean(row, UserDao.class));
        }
        System.out.println();

        //这里大家可以将users的列表进行输出
    }
}
