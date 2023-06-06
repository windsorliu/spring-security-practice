package com.windsor.springsecuritypractice.repository;

import org.springframework.stereotype.Repository;

import java.util.LinkedHashMap;
import java.util.Map;

@Repository
public class UserDao {

    // 實例初始化區塊（instance initializer block）
    public Map<String , Map<String ,String >> users ;
    {
        //A01, 1234
        Map<String ,String > infoA01=new LinkedHashMap<>();
        infoA01.put("password","$2a$10$WSDfPdPeEsFfX0Y9pTfbeOaIMiAghGUwcQOVpWNP6bfSLr4lyCiSy"); //1234
        infoA01.put("authority","admin,normal,ROLE_manager");

        //A02, 5678
        Map<String ,String > infoA02=new LinkedHashMap<>();
        infoA02.put("password","$2a$10$GAnubwenwx7vS4clgHlqGeAi6sg1LkBd9rJnyBtcU30LIdrvXS6Wi"); //5678
        infoA02.put("authority","admin,normal,ROLE_employee");

        users = new LinkedHashMap<>();
        users.put("A01",infoA01);
        users.put("A02",infoA02);

        System.out.println(users);
    }

}
