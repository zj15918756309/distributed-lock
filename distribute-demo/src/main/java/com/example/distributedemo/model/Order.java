package com.example.distributedemo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.id
     *
     * @mbg.generated Thu Dec 10 15:25:02 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.order_status
     *
     * @mbg.generated Thu Dec 10 15:25:02 CST 2020
     */
    private Integer orderStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.receiver_name
     *
     * @mbg.generated Thu Dec 10 15:25:02 CST 2020
     */
    private String receiverName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.receiver_mobile
     *
     * @mbg.generated Thu Dec 10 15:25:02 CST 2020
     */
    private String receiverMobile;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.order_amount
     *
     * @mbg.generated Thu Dec 10 15:25:02 CST 2020
     */
    private BigDecimal orderAmount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.create_time
     *
     * @mbg.generated Thu Dec 10 15:25:02 CST 2020
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.create_user
     *
     * @mbg.generated Thu Dec 10 15:25:02 CST 2020
     */
    private String createUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.update_time
     *
     * @mbg.generated Thu Dec 10 15:25:02 CST 2020
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.update_user
     *
     * @mbg.generated Thu Dec 10 15:25:02 CST 2020
     */
    private String updateUser;

}