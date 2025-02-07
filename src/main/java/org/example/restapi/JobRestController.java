package org.example.restapi;

import org.example.restapi.model.JobPost;
import org.example.restapi.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000/")
public class JobRestController {
    @Autowired
    private JobService service;

    @GetMapping("jobs")
    public List<JobPost> viewalljob(){
        return service.getAllJobs();
    }
    @GetMapping("job/{id}")
    public JobPost viewjob(@PathVariable int id){
        return service.get(id);
    }

    @PostMapping("job")
    public int createJob(@RequestBody JobPost jobpost) {
        service.add(jobpost);
        return jobpost.getPostId();
    }

    @PutMapping("job")
    public JobPost update(@RequestBody JobPost jobpost){
        service.update(jobpost);
        return service.get(jobpost.getPostId());
    }
    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable int id){
        service.remove(id);
    }
}
