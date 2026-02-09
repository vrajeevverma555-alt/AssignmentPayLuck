package com.example.demo.integration;

import lombok.extern.slf4j.Slf4j;
import com.example.demo.model.LoanAccountResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@Slf4j
public class LoanAccountClient {

    private final RestTemplate restTemplate = new RestTemplate();

    public LoanAccountResponse fetchLoanAccount(String loanAccountNumber) {

        String url = "https://demo9993930.mockable.io/loanaccount/" + loanAccountNumber;
        log.info("Calling external API: {}", url);

        return restTemplate.getForObject(url, LoanAccountResponse.class);
    }
}
