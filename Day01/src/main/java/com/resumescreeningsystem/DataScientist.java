package com.resumescreeningsystem;
// DataScientist inherit thr JobRole class
public class DataScientist extends JobRole {
    public DataScientist() {
        super("Data Scientist");
    }

    @Override
    public boolean evaluateResume(String resumeContent) {
        return resumeContent.toLowerCase().contains("machine learning") || resumeContent.toLowerCase().contains("data analysis");
    }
}