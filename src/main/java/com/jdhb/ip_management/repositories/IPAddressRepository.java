package com.jdhb.ip_management.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jdhb.ip_management.entities.IPAddress;

public interface IPAddressRepository extends JpaRepository<IPAddress, Long> {

}
