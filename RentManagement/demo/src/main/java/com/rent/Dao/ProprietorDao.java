package com.rent.Dao;

import com.rent.Entity.Proprietor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProprietorDao extends JpaRepository<Proprietor, Integer> {
}
