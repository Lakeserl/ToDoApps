package com.toDoApps.server.Repository;

import com.toDoApps.server.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface NoteRepository extends JpaRepository<Note, Long> {
    List<Note> findByUserName(String ownerUsername);

}
