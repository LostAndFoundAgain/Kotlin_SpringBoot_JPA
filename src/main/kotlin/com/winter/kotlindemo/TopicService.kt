package com.winter.kotlindemo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*
import kotlin.collections.ArrayList

@Service
class TopicService {
    @Autowired
    lateinit var topicRepository : TopicRepository

    fun getAllTopics(): ArrayList<Topic> = ArrayList(topicRepository.findAll().toList())

    fun getTopic(id: String): Optional<Topic> = topicRepository.findById(id)

    //fun getTopicByName(topicName: String) : Topic = topicRepository.findByName(topicName)

    fun addTopic(topic: Topic) = topicRepository.save(topic)

    fun updateTopic(id : String,topic: Topic)  = topicRepository.save(topic)

    fun deleteTopic(id: String) = topicRepository.deleteById(id)
}