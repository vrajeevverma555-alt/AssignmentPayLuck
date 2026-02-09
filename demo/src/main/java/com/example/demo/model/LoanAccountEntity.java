package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "loan_account")
@Data
public class LoanAccountEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "loan_account_number")
    private String loanAccountNumber;

    @Column(name = "due_date")
    private LocalDate dueDate;

    @Column(name = "emi_amount")
    private Integer emiAmount;
}

