package net.yury.P23Visitor;

public class ComputerPartWriteVisitor implements ComputerPartVisitor {

    @Override
    public void visit(Computer computer) {
        System.out.println("Writing Computer.");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Writing Mouse.");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Writing Keyboard.");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Writing Monitor.");
    }
}
