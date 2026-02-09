package model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class LoanAccountResponse {

    private String loanAccountNumber;
    private LocalDate dueDate;
    private Integer emiAmount;
}