package com.just;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class JdbcTemplateUtil {
   private static JdbcTemplate jdbcTemplate;
   public static JdbcTemplate jdbcTemplate() {
       if(jdbcTemplate == null) {
           jdbcTemplate = createJdbcTemplate();
       }
       return jdbcTemplate;
   }
   private static JdbcTemplate createJdbcTemplate() {
       DriverManagerDataSource ds = new DriverManagerDataSource();
       ds.setDriverClassName("com.mysql.jdbc.Driver");
       ds.setUrl("jdbc:mysql://localhost:3306/demo");
       ds.setUsername("root");
       ds.setPassword("zard");
       return new JdbcTemplate(ds);
   }
}