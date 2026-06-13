package camt.se234.deployment.service;

import camt.se234.deployment.entity.Grade;
import org.springframework.stereotype.Service;

@Service
public class GradeServiceImpl implements GradeService {
    @Override
    public String getGrade(double score) {
        if (score > 60) {
            return "pass";
        }
        else return "dont pass";

}
