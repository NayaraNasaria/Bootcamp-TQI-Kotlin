package com.example.creditapplicationsystem.dto

import com.example.creditapplicationsystem.entity.Address
import com.example.creditapplicationsystem.entity.Customer
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotEmpty
import jakarta.validation.constraints.NotNull
import org.hibernate.validator.constraints.br.CPF
import java.math.BigDecimal

data class CustomerDto (
    @field:NotEmpty(message = "Invalid Name") val firstName: String,
    @field:NotEmpty(message = "Invalid Last Name") val lastName: String,
    @CPF(message = "This Invalid CPF") val cpf: String,
    @field:NotNull(message = "Invalid Income") val income: BigDecimal,
    @field:Email(message = "Invalid E-mail") val email: String,
    @field:NotEmpty(message = "Invalid Password") val password: String,
    @field:NotEmpty(message = "Invalid Zip Code") val zipCode: String,
    @field:NotEmpty(message = "Invalid Street") val street: String,
) {

    fun toEntity() : Customer = Customer(
        firstName = this.firstName,
        lastName = this.lastName,
        cpf = this.cpf,
        income = this.income,
        email = this.email,
        password = this.password,
        address = Address(
            zipCode = this.zipCode,
            street = this.street
        )
    )
}
