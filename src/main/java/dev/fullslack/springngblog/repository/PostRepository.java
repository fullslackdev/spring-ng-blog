package dev.fullslack.springngblog.repository;

import dev.fullslack.springngblog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
