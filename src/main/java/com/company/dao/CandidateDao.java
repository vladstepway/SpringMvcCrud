package com.company.dao;

import com.company.model.Candidate;

import java.util.List;

public interface CandidateDao {

    Candidate getCandidate(int id);

    List<Candidate> getAllCandidates();

    int addCandidate(Candidate candidate);

    int updateCandidate(Candidate candidate);

    int deleteCandidate(int id);

}
