package at.jku.platform.repository;

import at.jku.platform.domain.AdminTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@SuppressWarnings("unused")
@Repository
public interface AdminTaskRepository extends JpaRepository<AdminTask, Long>, AdminTaskRepositoryCustom {}
