package com.miaoshaproject.service;

import com.miaoshaproject.error.BusinessException;
import com.miaoshaproject.service.model.OrderModel;

public interface OrderService {
    // 建议使用方案1.通过前端url上传过来秒杀活动的id，然后下单接口内校验对应id是否属于对应商品且活动已开始
    // 方案1：(1)模型扩展性，由于一个商品在不同APP可能有不同的秒杀活动，因此根据前端的url可直接判断；
    //       (2)对于非秒杀商品不需要在进行查询判断（非秒杀商品不会传到后端）
    // 方案2.直接在下单接口内判断对应的商品对应的商品是否存在秒杀活动，若存在进行中的则以秒杀价格下单
    OrderModel createOrder(Integer userId, Integer itemId, Integer promoId ,Integer amount) throws BusinessException;
}
