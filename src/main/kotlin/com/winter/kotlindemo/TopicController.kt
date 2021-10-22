package com.winter.kotlindemo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*
import javax.persistence.Id
import kotlin.collections.ArrayList

@RestController
class TopicController {

    @Autowired
    lateinit var topicService: TopicService

    @GetMapping
    fun welcomeMessage() : String{
        return "Welcome"
    }
    @GetMapping("topics")
    fun getALlTopics() : ArrayList<Topic>?{
        return topicService.getAllTopics()
    }

    @GetMapping("topics/{id}")
    fun getTopic(@PathVariable id: String) : Optional<Topic> {
        return topicService.getTopic(id)
    }

//    @GetMapping("topics/{name}")
//    fun getTopicByName(@PathVariable name: String) : Topic{
//        return topicService.getTopicByName(name)
//    }

    @PostMapping("topics/")
    fun addTopic(@RequestBody topic: Topic){
         topicService.addTopic(topic)
    }

    @PutMapping("topics/{id}")
    fun updateTopic(@PathVariable id: String, @RequestBody topic : Topic){
        topicService.updateTopic(id, topic)
    }

    @DeleteMapping("topics/{id}")
    fun deleteTopic(@PathVariable id : String){
        topicService.deleteTopic(id)
    }
}