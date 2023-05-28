package com.example.creditapplicationsystem.dto

import com.example.creditapplicationsystem.entity.Credit
import com.example.creditapplicationsystem.entity.Customer
import jakarta.validation.constraints.Future
import jakarta.validation.constraints.NotNull
import java.math.BigDecimal
import java.time.LocalDate

data class CreditDto (
    @field:NotNull(message = "Invalid Input") val creditValue: BigDecimal,
    @field:Future val dayFirstOfInstallment: LocalDate,
    @field:NotNull(message = "Invalid Input") val numberOfInstallment: Int,
    @field:NotNull(message = "Invalid Input") val customerId: Long
){

    fun toEntity(): Credit = Credit(
        creditValue = this.creditValue,
        dayFirstInstallment = this.dayFirstOfInstallment,
        numberOfInstallments = this.numberOfInstallment,
        customer = Customer(id = this.customerId)
    )
}
