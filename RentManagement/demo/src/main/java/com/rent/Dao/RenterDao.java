package com.rent.Dao;

import com.rent.Entity.Renter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RenterDao extends JpaRepository<Renter, Integer> {
}
