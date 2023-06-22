package com.example.eureka;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;



public interface CommentRepository extends JpaRepository<Comments,Integer>{

		public List<Comments> findByPid(int pid);
}
