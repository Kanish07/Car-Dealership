package com.cars365.cardealershipcars356.branch;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BranchService {
	
	private final BranchRepository branchRepository;

    @Autowired
    public BranchService(BranchRepository branchRepository){
        this.branchRepository = branchRepository;
    }

	public Optional<Branch> loginCustomer(Branch branch) {
		Optional<Branch> BranchExists = branchRepository.findBranchByBranchPhno(branch.getBranchPhno());

        if (!BranchExists.isPresent()) {
            throw new IllegalStateException("Invalid Phone Number");
        }

        String password = branch.getBranchPassword();
        String actPassword = BranchExists.get().getBranchPassword();
        if (!password.equals(actPassword)) {
            throw new IllegalStateException("Invalid Phone number and password.");
        }
        return BranchExists;
	}

}
