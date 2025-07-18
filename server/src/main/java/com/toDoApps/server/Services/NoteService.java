package com.toDoApps.server.Services;

import com.toDoApps.server.entity.Note;

import java.util.List;

public interface NoteService {
    Note createNoteForUser(String username, String content);
    Note updateNoteForUser(Long id, String username, String content);
    void deleteNoteForUser(Long id, String username);
    List<Note> getNotesForUser(String username);
}
