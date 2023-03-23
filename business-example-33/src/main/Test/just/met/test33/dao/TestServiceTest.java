package just.met.test33.dao;

import just.met.test33.entity.Address;
import just.met.test33.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class TestServiceTest {

    @Resource
    AddressRepository addressRepository;

    @Test
    public void test1() {
        Address address = new Address("地址1", "address1");
        addressRepository.save(address);
    }

    @Test
    public void test2() {
        //给Address对象设置一个没有ID的User
        User user = new User("用户1", "user1");
        Address address = addressRepository.findAddressByCode("address1").get(0);
        address.setUser(user);
        addressRepository.save(address);
    }

}