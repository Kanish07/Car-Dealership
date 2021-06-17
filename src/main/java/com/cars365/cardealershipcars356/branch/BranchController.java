package com.cars365.cardealershipcars356.branch;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cars365.cardealershipcars356.branch.BranchService;

@RestController
@CrossOrigin
@RequestMapping("/api/branch")
public class BranchController {

	private final BranchService branchService;
	
	@Autowired
    public BranchController(BranchService branchService){
        this.branchService = branchService;
    }
	
	@PostMapping(path = "/login")
    public Optional<Branch> loginBranch(@RequestBody Branch branch){
        return branchService.loginCustomer(branch);
    }
	
	
	
}
