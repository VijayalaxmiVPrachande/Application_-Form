package com.form.controller;

import com.form.model.Applicant;
import com.form.repository.ApplicantRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/applicants")
@CrossOrigin(origins = "*") // allow the HTML file (opened directly in browser) to call us
public class ApplicantController {

    private final ApplicantRepository repo;

    public ApplicantController(ApplicantRepository repo) {
        this.repo = repo;
    }

    // POST /api/applicants → save a new applicant
    @PostMapping
    public ResponseEntity<?> create(@RequestBody Applicant applicant) {
        // Basic validation
        if (applicant.getFirstName() == null || applicant.getFirstName().isBlank() ||
                applicant.getLastName() == null || applicant.getLastName().isBlank() ||
                applicant.getEmail() == null || applicant.getEmail().isBlank() ||
                applicant.getPhone() == null || applicant.getPhone().isBlank() ||
                applicant.getAddress() == null || applicant.getAddress().isBlank()) {

            return ResponseEntity.badRequest()
                    .body(Map.of("error", "All fields are required."));
        }

        Applicant saved = repo.save(applicant);
        return ResponseEntity.ok(saved);
    }

    // GET /api/applicants → list all stored applicants
    @GetMapping
    public ResponseEntity<List<Applicant>> getAll() {
        return ResponseEntity.ok(repo.findAll());
    }

    // GET /api/applicants/{id} → get one by id
    @GetMapping("/{id}")
    public ResponseEntity<?> getOne(@PathVariable Long id) {
        return repo.findById(id)
                .<ResponseEntity<?>>map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
