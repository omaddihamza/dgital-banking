package org.sid.repository;

import org.sid.entities.Operation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface OperationRepository extends JpaRepository<Operation,Long> {
    @Query("SELECT o FROM Operation o WHERE o.compte.codeCompte= :x order by o.dateOperation desc")
    Page<Operation> listoperations(@Param("x") String codeCpte, Pageable pageable);
}
