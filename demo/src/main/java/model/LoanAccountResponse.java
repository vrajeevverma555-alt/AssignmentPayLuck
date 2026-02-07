package model;

import lombok.Data;

@Data
public class LoanAccountResponse {

    private String loanAccountNumber;
    private String dueDate;
    private Integer emiAmount;
}