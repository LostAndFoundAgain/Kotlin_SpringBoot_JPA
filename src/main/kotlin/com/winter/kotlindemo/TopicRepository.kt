package com.winter.kotlindemo

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository


@Repository
interface TopicRepository : CrudRepository<Topic, String>{
   //fun findByName(topicName: String) : Topic
}