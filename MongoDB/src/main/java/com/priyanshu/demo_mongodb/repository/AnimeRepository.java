package com.priyanshu.demo_mongodb.repository;

import com.priyanshu.demo_mongodb.model.Anime;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AnimeRepository
        extends MongoRepository<Anime, String> {
}
