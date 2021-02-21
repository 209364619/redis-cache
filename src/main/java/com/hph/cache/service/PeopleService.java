package com.hph.cache.service;

import com.hph.cache.entity.People;
import com.hph.cache.repository.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@CacheConfig(cacheNames = "people") //缓存对应的名称
public class PeopleService {
    @Autowired
    private PeopleRepository peopleRepository;

    @Cacheable(key = "#id")                         //新增缓存
    public People selectPeopleById(Integer id){
        System.out.println("未能从缓存中获取数据！数据库检索。");
        Optional<People> byId = peopleRepository.findById(id);
        if(byId.get() != null){
            return byId.get();
        }
        return null;
    }

    @CacheEvict(key = "#id")                        //删除缓存
    public boolean deleteById(Integer id){
        peopleRepository.deleteById(id);
        return true;
    }

    @CachePut(key="#people.id")                      //更新缓存
    public People updateSert(People people){
        People save = peopleRepository.saveAndFlush(people);
        return save;
    }

}
