package com.yshyerp.crc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.yshyerp.crc.mapper")
@SpringBootApplication
public class YshyerpCrcApplication {

    public static void main(String[] args) {
        SpringApplication.run(YshyerpCrcApplication.class, args);
    }

}
