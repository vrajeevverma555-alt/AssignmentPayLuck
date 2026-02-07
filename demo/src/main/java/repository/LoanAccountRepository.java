package repository;

import model.LoanAccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanAccountRepository
        extends JpaRepository<LoanAccountEntity, Long> {
}

