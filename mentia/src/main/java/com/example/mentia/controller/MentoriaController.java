package com.example.mentia.controller;

import com.example.mentia.model.Mentoria;
import com.example.mentia.payload.MessageResponse;
import com.example.mentia.service.MentoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/mentorias")
public class MentoriaController {

    @Autowired
    private MentoriaService mentoriaService;

    @GetMapping
    @PreAuthorize("hasRole('USER') or hasRole('MENTOR') or hasRole('ADMIN')")
    public ResponseEntity<List<Mentoria>> getAllMentorias() {
        return ResponseEntity.ok(mentoriaService.findAll());
    }

    @PostMapping
    @PreAuthorize("hasRole('MENTOR') or hasRole('ADMIN')")
    public ResponseEntity<Mentoria> createMentoria(@RequestBody Mentoria mentoria) {
        Mentoria saved = mentoriaService.save(mentoria);
        return ResponseEntity.ok(saved);
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasRole('USER') or hasRole('MENTOR') or hasRole('ADMIN')")
    public ResponseEntity<?> getMentoriaById(@PathVariable Long id) {
        return mentoriaService.findById(id)
            .<ResponseEntity<?>>map(ResponseEntity::ok)
            .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<?> deleteMentoria(@PathVariable Long id) {
        mentoriaService.deleteById(id);
        return ResponseEntity.ok(new MessageResponse("Mentoria deleted successfully"));
    }
}
