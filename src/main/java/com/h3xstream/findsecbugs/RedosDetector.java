package com.h3xstream.findsecbugs;

import edu.umd.cs.findbugs.BugReporter;
import edu.umd.cs.findbugs.bcel.OpcodeStackDetector;

public class ReDosDetector extends OpcodeStackDetector {

    private BugReporter bugReporter;

    public ReDosDetector(BugReporter bugReporter) {
        this.bugReporter = bugReporter;
    }

    @Override
    public void sawOpcode(int seen) {

    }
}
