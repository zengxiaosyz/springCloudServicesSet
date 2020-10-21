package com.uni.cloud.microknife4jorder.domain;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

@Data
@EqualsAndHashCode(callSuper = false)
@Builder
public class Order {
    public Order(){

    }

    public Order(Long id, Long userId, Long productId, Integer count, BigDecimal money, Integer status) {
        this.id = id;
        this.userId = userId;
        this.productId = productId;
        this.count = count;
        this.money = money;
        this.status = status;
    }

    @ApiModelProperty("订单ID")
    private Long id;
    @ApiModelProperty("用户ID")
    private Long userId;
    @ApiModelProperty("商品ID")
    private Long productId;
    @ApiModelProperty("商品数量")
    private Integer count;
    @ApiModelProperty("商品单价")
    private BigDecimal money;
    @ApiModelProperty("订单状态")
    private Integer status;

}
