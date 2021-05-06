package com.ivymon.inventory;

import com.ivymon.inventory.constant.Const;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@MapperScan(basePackages = {Const.MAPPER_PACKAGE}, sqlSessionFactoryRef="sqlSessionFactory")
@PropertySource(value = {"application.yaml", "application-${spring.profiles.active}.yaml"})
public class InventoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryApplication.class, args);
    }

}
