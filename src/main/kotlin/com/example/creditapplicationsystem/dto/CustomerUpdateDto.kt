package com.example.creditapplicationsystem.dto

import com.example.creditapplicationsystem.entity.Customer
import jakarta.validation.constraints.NotEmpty
import jakarta.validation.constraints.NotNull
import java.math.BigDecimal

data class CustomerUpdateDto (
    @field:NotEmpty(message = "Invalid Name") val firstName: String,
    @field:NotEmpty(message = "Invalid Last Name") val lastName: String,
    @field:NotNull(message = "Invalid Income") val income: BigDecimal,
    @field:NotEmpty(message = "Invalid Zip Code") val zipCode: String,
    @field:NotEmpty(message = "Invalid Street") val street: String,
){
    fun toEntity(customer: Customer) : Customer{
        customer.firstName = this.firstName
        customer.lastName = this.lastName
        customer.income = this.income
        customer.address.street = this.street
        customer.address.zipCode = this.zipCode

        return customer
    }
}
