package com.example.mentia.service;

import com.example.mentia.model.Mentoria;
import com.example.mentia.repository.MentoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MentoriaService {
    @Autowired
    private MentoriaRepository mentoriaRepository;

    public List<Mentoria> findAll() {
        return mentoriaRepository.findAll();
    }

    public Optional<Mentoria> findById(Long id) {
        return mentoriaRepository.findById(id);
    }

    public Mentoria save(Mentoria mentoria) {
        return mentoriaRepository.save(mentoria);
    }

    public void deleteById(Long id) {
        mentoriaRepository.deleteById(id);
    }
}
