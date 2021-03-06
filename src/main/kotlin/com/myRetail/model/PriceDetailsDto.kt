package com.myRetail.model

import com.myRetail.model.request.UpdateItemPriceDetailsDto
import org.springframework.data.cassandra.core.mapping.PrimaryKey
import org.springframework.data.cassandra.core.mapping.Table

@Table("price_details")
data class PriceDetailsDto(@PrimaryKey val id: PriceDetailsKey, val value: Double, val currency_code: String) {
    constructor(id: Int, updateItemPriceDetailsDto: UpdateItemPriceDetailsDto) : this(PriceDetailsKey(id),
                                                                                updateItemPriceDetailsDto.value,
                                                                                updateItemPriceDetailsDto.currency_code)
}