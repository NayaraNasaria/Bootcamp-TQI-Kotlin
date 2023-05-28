package com.example.creditapplicationsystem.service.impl

import com.example.creditapplicationsystem.entity.Customer
import com.example.creditapplicationsystem.service.ICustomerService
import org.springframework.stereotype.Service

@Service
class CustomerService : ICustomerService {
    override fun save(customer: Customer): Customer {
        TODO("Not yet implemented")
    }

    override fun findById(id: Long): Customer {
        TODO("Not yet implemented")
    }

    override fun delete(id: Long): Customer {
        TODO("Not yet implemented")
    }
}