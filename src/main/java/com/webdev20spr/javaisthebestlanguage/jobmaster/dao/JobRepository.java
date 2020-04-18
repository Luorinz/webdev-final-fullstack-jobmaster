package com.webdev20spr.javaisthebestlanguage.jobmaster.dao;

import com.webdev20spr.javaisthebestlanguage.jobmaster.model.Job;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Anda Luo
 * 2020-4-7
 */
@Repository
public interface JobRepository extends MongoRepository<Job, String> {
    public List<Job> findAll();

}
