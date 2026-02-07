package service;

import integration.LoanAccountClient;
import lombok.extern.slf4j.Slf4j;
import model.LoanAccountEntity;
import model.LoanAccountResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.LoanAccountRepository;

@Service
@Slf4j
public class LoanAccountService {

    @Autowired
    private LoanAccountClient loanAccountClient;

    @Autowired
    private LoanAccountRepository repository;

    public LoanAccountResponse getLoanAccount(String loanAccountNumber) {

        LoanAccountResponse response =
                loanAccountClient.fetchLoanAccount(loanAccountNumber);

        log.debug("API Response: {}", response);

        LoanAccountEntity entity = new LoanAccountEntity();
        entity.setLoanAccountNumber(response.getLoanAccountNumber());
        entity.setDueDate(response.getDueDate());
        entity.setEmiAmount(response.getEmiAmount());

        repository.save(entity);
        log.info("Loan account saved in DB");

        return response;
    }
}

