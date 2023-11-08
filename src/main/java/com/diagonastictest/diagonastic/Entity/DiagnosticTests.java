package com.diagonastictest.diagonastic.Entity;

import java.sql.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class DiagnosticTests {
@Id
private int test_id;
private String test_name;
private String lab_name;
private String Processing_time;
@DateTimeFormat(pattern = "yy-MM-dd")
private Date order_date;

}
