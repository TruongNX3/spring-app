package com.ntq.springapp.repositories;

import com.ntq.springapp.entities.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Integer>{

}
