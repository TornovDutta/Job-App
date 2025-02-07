package org.example.restapi.service;

import org.example.restapi.model.JobPost;
import org.example.restapi.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    @Autowired
    private JobRepo repo;
    public void addJob(JobPost job) {
        repo.addJob(job);
    }
    public List<JobPost> getAllJobs() {
        return repo.getAllJobs();
    }

    public JobPost get(int id) {
        return repo.get(id);
    }

    public void update(JobPost job) {
         repo.update(job);
    }

    public void remove(int id) {
        repo.remove(id);
    }

    public void add(JobPost jobpost) {
        repo.save(jobpost);
    }
}
