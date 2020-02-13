package org.patterns.visitor;

public class Demo {

    public static void main(String[] args) {
        PlatformAnalyzerVisitor platformAnalyzerVisitor = new PlatformAnalyzerVisitor();
        new PS4().accept(platformAnalyzerVisitor);
        new XboxOne().accept(platformAnalyzerVisitor);
        new PC().accept(platformAnalyzerVisitor);
    }

}
