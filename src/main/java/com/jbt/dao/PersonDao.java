package com.jbt.dao;

import com.jbt.model.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Vivekanand on 25-04-2017.
 */
public interface PersonDao extends JpaRepository<PersonEntity, Integer>{
}
