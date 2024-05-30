package umc.study.repository;

import org.springframework.data.repository.CrudRepository;
import umc.study.domain.Store;

public interface StoreRepository extends CrudRepository<Store, Long> {
}
