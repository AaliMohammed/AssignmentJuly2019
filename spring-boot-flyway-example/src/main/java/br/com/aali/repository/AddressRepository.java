package br.com.aali.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.aali.model.entity.Address;

/**
 * The Address Repository Interface.
 * 
 * @author Ryan Padilha <ryan.padilha@gmail.com>
 * @since 0.1
 *
 */
public interface AddressRepository extends JpaRepository<Address, Long> {

}
