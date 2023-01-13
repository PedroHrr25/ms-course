package com.pedrohrr.hrworker.repositories;

import com.pedrohrr.hrworker.entites.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository <Worker, Long> {
}
