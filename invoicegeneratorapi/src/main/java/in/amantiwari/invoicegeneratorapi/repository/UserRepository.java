package in.amantiwari.invoicegeneratorapi.repository;

import in.amantiwari.invoicegeneratorapi.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<in.amantiwari.invoicegeneratorapi.entity.User, String> {

    Optional<User> findByClerkId(String clerkId);

    boolean existsByClerkId(String clerkId);
}
