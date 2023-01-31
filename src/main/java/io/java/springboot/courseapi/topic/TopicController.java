package io.java.springboot.courseapi.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	@GetMapping("/topics")
	public List<Topic> getAllTopics() {
		return topicService.getAllTopics();
	}
	
	@GetMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id){  //PathVariable matches the id in URL with the parameter passed 
		return topicService.getTopic(id);
	}

	@RequestMapping(value="/topics", method = RequestMethod.POST)
	@ResponseBody
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
		//System.out.println("Test");
	}
	
	@PutMapping("/topics/{id}")
	public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
		topicService.updateTopic(topic, id);
	}
	
	@DeleteMapping("/topics/{id}")
	public void deleteTopic(@PathVariable String id){  //PathVariable matches the id in URL with the parameter passed 
		topicService.deleteTopic(id);
	}
}
