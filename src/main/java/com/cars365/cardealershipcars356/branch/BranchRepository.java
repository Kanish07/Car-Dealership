package com.cars365.cardealershipcars356.branch;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BranchRepository extends JpaRepository<Branch, Long> {

	Optional<Branch> findBranchByBranchPhno(Long branchPhno);
	
}
