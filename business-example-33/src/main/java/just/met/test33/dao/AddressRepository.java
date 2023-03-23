package just.met.test33.dao;

import just.met.test33.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author wangmaogang
 */
@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
    List<Address> findAddressByCode(String code);
}
