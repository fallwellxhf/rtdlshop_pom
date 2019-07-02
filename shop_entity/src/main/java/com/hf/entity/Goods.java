package com.hf.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("goods")
public class Goods implements Serializable {

    private int id;
    private String gname;
    private int gsave;
    private BigDecimal gprice ;
    private String ginfo;
    private String gimage;
    private int status;
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:ss:mm")
    private Date createtime;
    private int tid;






}
