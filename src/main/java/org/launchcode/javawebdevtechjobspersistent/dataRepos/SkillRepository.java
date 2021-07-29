package org.launchcode.javawebdevtechjobspersistent.dataRepos;

import org.launchcode.javawebdevtechjobspersistent.models.Job;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillRepository extends CrudRepository<Job, Integer> {
}