package ExRefactoringGuru.commands;

public interface Command {
    String getName();
    void execute();
}