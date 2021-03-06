package com.lcdd.backend.dbrepositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lcdd.backend.pojo.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

	Role findByName(String name);
	
	Role findById(long id);
		
}
