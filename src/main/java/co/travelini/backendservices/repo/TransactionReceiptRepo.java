package co.travelini.backendservices.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import co.travelini.backendservices.entity.ServiceTransactionList;

public interface TransactionReceiptRepo extends JpaRepository<ServiceTransactionList, Long>
{

	long findByAccountId(long accountId);

}
